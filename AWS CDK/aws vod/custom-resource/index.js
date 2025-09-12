/**
 * Custom Resource Lambda Function
 * This function handles:
 * - Getting MediaConvert endpoint
 * - Configuring S3 bucket notifications
 * - Uploading default job settings
 */

const AWS = require('aws-sdk');
const response = require('cfn-response');

exports.handler = async (event, context) => {
    console.log('Request Type:', event.RequestType);
    console.log('Request:', JSON.stringify(event, undefined, 2));

    try {
        if (event.RequestType === 'Create' || event.RequestType === 'Update') {
            // Get MediaConvert endpoint
            const mediaconvert = new AWS.MediaConvert({ region: process.env.AWS_REGION });
            const endpoints = await mediaconvert.describeEndpoints({}).promise();
            const endpoint = endpoints.Endpoints[0].Url;

            // Generate UUID for tracking
            const { v4: uuidv4 } = require('uuid');
            const uuid = uuidv4();

            // Configure S3 bucket notification (if properties provided)
            if (event.ResourceProperties.SourceBucket && event.ResourceProperties.LambdaArn) {
                const s3 = new AWS.S3();
                await s3.putBucketNotificationConfiguration({
                    Bucket: event.ResourceProperties.SourceBucket,
                    NotificationConfiguration: {
                        LambdaConfigurations: [{
                            Id: 'VODLambdaTrigger',
                            LambdaFunctionArn: event.ResourceProperties.LambdaArn,
                            Events: ['s3:ObjectCreated:*'],
                            Filter: {
                                Key: {
                                    FilterRules: [{
                                        Name: 'suffix',
                                        Value: '.mp4'
                                    }]
                                }
                            }
                        }]
                    }
                }).promise();
            }

            await response.send(event, context, response.SUCCESS, {
                Endpoint: endpoint,
                UUID: uuid
            });
        } else if (event.RequestType === 'Delete') {
            await response.send(event, context, response.SUCCESS);
        }
    } catch (error) {
        console.error('Error:', error);
        await response.send(event, context, response.FAILED, {
            Error: error.message
        });
    }
};
