import * as cdk from "aws-cdk-lib";
import { Construct } from "constructs";
import * as cognito from "aws-cdk-lib/aws-cognito";
import * as s3 from 'aws-cdk-lib/aws-s3';

export class CdkS3Stack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);
 
     // Create S3 buckets
    const dataBucket = new s3.Bucket(this, 'shimbhu-data-bucket-stack', {
      versioned: false,
      removalPolicy: cdk.RemovalPolicy.RETAIN,
      encryption: s3.BucketEncryption.S3_MANAGED,
    });

    const assetsBucket = new s3.Bucket(this, 'shimbhu-assest-bucket-stack', {
      publicReadAccess: false,
      blockPublicAccess: s3.BlockPublicAccess.BLOCK_ALL,
    });

    // Outputs
    new cdk.CfnOutput(this, 'DataBucketName', {
      value: dataBucket.bucketName,
      description: 'The name of the data bucket',
    });
    
    new cdk.CfnOutput(this, 'AssetsBucketName', {
      value: assetsBucket.bucketName,
      description: 'The name of the assets bucket',
    });
    


         
  }
}