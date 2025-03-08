import * as cdk from 'aws-cdk-lib';
import { Construct } from 'constructs';
import * as s3 from 'aws-cdk-lib/aws-s3';

export class CdkProjectStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

      // Create an S3 bucket
      const bucket = new s3.Bucket(this, 'MyFirstBucket', {
        bucketName: 'shimbhu-cdk-bucket-12329',  // Optional: specify bucket name
        versioned: false,                          // Enable versioning
        encryption: s3.BucketEncryption.S3_MANAGED, // Use S3-managed encryption
        removalPolicy: cdk.RemovalPolicy.DESTROY    // For demo purposes only
      });
  }
}
