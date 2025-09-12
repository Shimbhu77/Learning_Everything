/**
 * Job Complete Lambda Function
 * Triggered by EventBridge when MediaConvert jobs complete
 */

const AWS = require('aws-sdk');

exports.handler = async (event) => {
    console.log('Event:', JSON.stringify(event, undefined, 2));

    const mediaconvert = new AWS.MediaConvert({
        endpoint: process.env.MEDIACONVERT_ENDPOINT
    });

    const s3 = new AWS.S3();
    const sns = new AWS.SNS();

    try {
        const jobId = event.detail.jobId;
        const status = event.detail.status;
        
        console.log(`Processing job ${jobId} with status ${status}`);

        // Get job details
        const jobData = await mediaconvert.getJob({ Id: jobId }).promise();
        const job = jobData.Job;

        let message = '';
        let outputs = [];

        if (status === 'COMPLETE') {
            // Process outputs
            if (job.OutputGroupDetails) {
                for (const group of job.OutputGroupDetails) {
                    if (group.OutputDetails) {
                        for (const output of group.OutputDetails) {
                            if (output.OutputFilePaths) {
                                for (const filePath of output.OutputFilePaths) {
                                    // Convert S3 path to CloudFront URL
                                    const s3Key = filePath.replace(`s3://${process.env.DESTINATION_BUCKET}/`, '');
                                    const cloudFrontUrl = `https://${process.env.CLOUDFRONT_DOMAIN}/${s3Key}`;
                                    
                                    outputs.push({
                                        s3Path: filePath,
                                        cloudFrontUrl: cloudFrontUrl,
                                        key: s3Key
                                    });
                                }
                            }
                        }
                    }
                }
            }

            // Update manifest file
            await updateJobManifest(s3, job, outputs);

            message = `Job ${jobId} completed successfully. ${outputs.length} output(s) created.`;
            
            // Send metrics if enabled
            if (process.env.METRICS === 'Yes') {
                await sendAnonymizedMetrics(job, status);
            }

        } else if (status === 'ERROR') {
            message = `Job ${jobId} failed. Error: ${job.ErrorMessage || 'Unknown error'}`;
        } else if (status === 'CANCELED') {
            message = `Job ${jobId} was canceled.`;
        } else {
            message = `Job ${jobId} status: ${status}`;
        }

        // Send SNS notification
        if (process.env.SNS_TOPIC_ARN) {
            await sns.publish({
                TopicArn: process.env.SNS_TOPIC_ARN,
                Subject: `VOD Job ${status}`,
                Message: JSON.stringify({
                    jobId: jobId,
                    status: status,
                    message: message,
                    outputs: outputs,
                    timestamp: new Date().toISOString()
                }, null, 2)
            }).promise();
        }

        console.log(message);

    } catch (error) {
        console.error('Error:', error);
        
        // Send error notification
        if (process.env.SNS_TOPIC_ARN) {
            try {
                await sns.publish({
                    TopicArn: process.env.SNS_TOPIC_ARN,
                    Subject: 'VOD Processing Error',
                    Message: `Error processing job completion: ${error.message}`
                }).promise();
            } catch (snsError) {
                console.error('Failed to send error notification:', snsError);
            }
        }
        
        throw error;
    }
};

async function updateJobManifest(s3, job, outputs) {
    try {
        const manifestKey = process.env.JOB_MANIFEST || 'jobs-manifest.json';
        
        let manifest = [];
        
        // Try to get existing manifest
        try {
            const existingManifest = await s3.getObject({
                Bucket: process.env.SOURCE_BUCKET,
                Key: manifestKey
            }).promise();
            manifest = JSON.parse(existingManifest.Body.toString());
        } catch (error) {
            console.log('Creating new manifest file');
        }

        // Add current job to manifest
        manifest.push({
            jobId: job.Id,
            status: job.Status,
            createdAt: job.CreatedAt,
            completedAt: new Date().toISOString(),
            source: job.UserMetadata?.SourceKey || 'unknown',
            outputs: outputs,
            userMetadata: job.UserMetadata
        });

        // Keep only last 100 jobs
        if (manifest.length > 100) {
            manifest = manifest.slice(-100);
        }

        // Upload updated manifest
        await s3.putObject({
            Bucket: process.env.SOURCE_BUCKET,
            Key: manifestKey,
            Body: JSON.stringify(manifest, null, 2),
            ContentType: 'application/json'
        }).promise();

        console.log('Job manifest updated');

    } catch (error) {
        console.error('Error updating manifest:', error);
        // Don't throw - this is not critical
    }
}

async function sendAnonymizedMetrics(job, status) {
    try {
        const https = require('https');
        
        const metricsData = {
            Solution: process.env.SOLUTION_ID,
            Version: process.env.VERSION,
            UUID: process.env.UUID,
            TimeStamp: new Date().toISOString(),
            Data: {
                JobStatus: status,
                JobDurationMinutes: job.Timing?.FinishTime && job.Timing?.SubmitTime 
                    ? Math.round((new Date(job.Timing.FinishTime) - new Date(job.Timing.SubmitTime)) / 60000)
                    : 0,
                OutputGroups: job.Settings?.OutputGroups?.length || 0
            }
        };

        const data = JSON.stringify(metricsData);
        
        const options = {
            hostname: 'metrics.awssolutionsbuilder.com',
            port: 443,
            path: '/generic',
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Content-Length': data.length
            }
        };

        return new Promise((resolve, reject) => {
            const req = https.request(options, (res) => {
                console.log(`Metrics sent. Status: ${res.statusCode}`);
                resolve();
            });

            req.on('error', (error) => {
                console.error('Error sending metrics:', error);
                resolve(); // Don't fail the function for metrics errors
            });

            req.write(data);
            req.end();
        });

    } catch (error) {
        console.error('Error preparing metrics:', error);
        // Don't throw - metrics are not critical
    }
}
