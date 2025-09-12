/**
 * Job Submit Lambda Function
 * Triggered by S3 events to submit MediaConvert jobs
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
        for (const record of event.Records) {
            if (record.eventName.startsWith('ObjectCreated')) {
                const bucket = record.s3.bucket.name;
                const key = decodeURIComponent(record.s3.object.key.replace(/\+/g, ' '));
                
                console.log(`Processing file: ${key} from bucket: ${bucket}`);

                // Load job settings
                let jobSettings;
                try {
                    const jobSettingsObj = await s3.getObject({
                        Bucket: bucket,
                        Key: process.env.JOB_SETTINGS || 'job-settings.json'
                    }).promise();
                    jobSettings = JSON.parse(jobSettingsObj.Body.toString());
                } catch (error) {
                    console.log('Using default job settings');
                    jobSettings = getDefaultJobSettings();
                }

                // Update job settings with current file
                jobSettings.Inputs[0].FileInput = `s3://${bucket}/${key}`;
                
                // Update outputs to point to destination bucket
                if (jobSettings.OutputGroups) {
                    jobSettings.OutputGroups.forEach(group => {
                        if (group.OutputGroupSettings?.FileGroupSettings) {
                            group.OutputGroupSettings.FileGroupSettings.Destination = 
                                `s3://${process.env.DESTINATION_BUCKET}/`;
                        }
                    });
                }

                // Submit job
                const jobParams = {
                    JobTemplate: undefined,
                    Role: process.env.MEDIACONVERT_ROLE,
                    Settings: jobSettings,
                    UserMetadata: {
                        StackName: process.env.STACKNAME,
                        SourceBucket: bucket,
                        SourceKey: key
                    }
                };

                const job = await mediaconvert.createJob(jobParams).promise();
                console.log(`MediaConvert job created: ${job.Job.Id}`);

                // Send SNS notification
                if (process.env.SNS_TOPIC_ARN) {
                    await sns.publish({
                        TopicArn: process.env.SNS_TOPIC_ARN,
                        Subject: 'VOD Job Submitted',
                        Message: `MediaConvert job ${job.Job.Id} submitted for file ${key}`
                    }).promise();
                }
            }
        }
    } catch (error) {
        console.error('Error:', error);
        throw error;
    }
};

function getDefaultJobSettings() {
    return {
        "Inputs": [{
            "FileInput": "",
            "AudioSelectors": {
                "Audio Selector 1": {
                    "Offset": 0,
                    "DefaultSelection": "DEFAULT",
                    "ProgramSelection": 1
                }
            },
            "VideoSelector": {
                "ColorSpace": "FOLLOW"
            }
        }],
        "OutputGroups": [{
            "Name": "File Group",
            "OutputGroupSettings": {
                "Type": "FILE_GROUP_SETTINGS",
                "FileGroupSettings": {
                    "Destination": ""
                }
            },
            "Outputs": [{
                "VideoDescription": {
                    "Width": 1280,
                    "Height": 720,
                    "CodecSettings": {
                        "Codec": "H_264",
                        "H264Settings": {
                            "MaxBitrate": 2000000,
                            "RateControlMode": "QVBR",
                            "SceneChangeDetect": "TRANSITION_DETECTION"
                        }
                    }
                },
                "AudioDescriptions": [{
                    "AudioTypeControl": "FOLLOW_INPUT",
                    "CodecSettings": {
                        "Codec": "AAC",
                        "AacSettings": {
                            "AudioDescriptionBroadcasterMix": "NORMAL",
                            "Bitrate": 96000,
                            "RateControlMode": "CBR",
                            "CodecProfile": "LC",
                            "CodingMode": "CODING_MODE_2_0",
                            "RawFormat": "NONE",
                            "SampleRate": 48000,
                            "Specification": "MPEG4"
                        }
                    }
                }],
                "ContainerSettings": {
                    "Container": "MP4",
                    "Mp4Settings": {
                        "CslgAtom": "INCLUDE",
                        "FreeSpaceBox": "EXCLUDE",
                        "MoovPlacement": "PROGRESSIVE_DOWNLOAD"
                    }
                },
                "NameModifier": "_720p"
            }]
        }]
    };
}
