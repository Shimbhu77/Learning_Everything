import * as cdk from "aws-cdk-lib";
import { Construct } from "constructs";
import * as iam from "aws-cdk-lib/aws-iam";

export class IamUsersStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

    // Create cognito-admin user with Cognito Power User permissions
    const cognitoAdmin = new iam.User(this, "CognitoAdmin", {
      userName: "cognito-admin",
    });
    
    cognitoAdmin.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName("AmazonCognitoPowerUser")
    );

    // Create ssm-admin user with SSM Read permissions
    const ssmAdmin = new iam.User(this, "SsmAdmin", {
      userName: "ssm-admin",
    });
    
    ssmAdmin.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName("AmazonSSMReadOnlyAccess")
    );

    // Create s3-admin user with S3 Full Access permissions
    const s3Admin = new iam.User(this, "S3Admin", {
      userName: "s3-admin",
    });
    
    s3Admin.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName("AmazonS3FullAccess")
    );

    // Create ci-cd-admin user with S3 Full Access and Admin Access permissions
    const ciCdAdmin = new iam.User(this, "CiCdAdmin", {
      userName: "ci-cd-admin",
    });
    
    ciCdAdmin.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName("AmazonS3FullAccess")
    );
    
    ciCdAdmin.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName("AdministratorAccess-AWSElasticBeanstalk")
    );

    // Create access keys for all users (optional - you can omit this if you prefer console access only)
    // we will manually create access keys for these users in the AWS Console
    // new iam.CfnAccessKey(this, "CognitoAdminAccessKey", {
    //   userName: cognitoAdmin.userName,
    // });

    // new iam.CfnAccessKey(this, "SsmAdminAccessKey", {
    //   userName: ssmAdmin.userName,
    // });

    // new iam.CfnAccessKey(this, "S3AdminAccessKey", {
    //   userName: s3Admin.userName,
    // });

    // new iam.CfnAccessKey(this, "CiCdAdminAccessKey", {
    //   userName: ciCdAdmin.userName,
    // });

    // Outputs
    new cdk.CfnOutput(this, "CognitoAdminUserName", {
      value: cognitoAdmin.userName,
      description: "Cognito Admin User Name",
    });

    new cdk.CfnOutput(this, "SsmAdminUserName", {
      value: ssmAdmin.userName,
      description: "SSM Admin User Name",
    });

    new cdk.CfnOutput(this, "S3AdminUserName", {
      value: s3Admin.userName,
      description: "S3 Admin User Name",
    });

    new cdk.CfnOutput(this, "CiCdAdminUserName", {
      value: ciCdAdmin.userName,
      description: "CI/CD Admin User Name",
    });
  }
}