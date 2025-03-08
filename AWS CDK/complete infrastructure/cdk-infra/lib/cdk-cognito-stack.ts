import * as cdk from "aws-cdk-lib";
import { Construct } from "constructs";
import * as cognito from "aws-cdk-lib/aws-cognito";

export class CdkCognitoStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

    // Create Cognito User Pool
    const userPool = new cognito.UserPool(this, "shimbhu-cdk-userpool-03", {
      selfSignUpEnabled: true,
      autoVerify: { email: true, phone: true },
      signInAliases: {
        email: true,
        phone: true,
        username: false,
        preferredUsername: false
      },
      passwordPolicy: {
        minLength: 8,
        requireLowercase: true,
        requireUppercase: true,
        requireDigits: true,
        requireSymbols: true,
      },
    });

    // Create a User Pool Client for server-side applications
    const userPoolClient = new cognito.UserPoolClient(this, "RestClient", {
      userPool,
      generateSecret: true,
    });

    // Create a User Pool Client for Flutter frontend
    const flutterClient = new cognito.UserPoolClient(this, "FlutterClient", {
      userPool,
      generateSecret: false, // No secret for frontend applications
      authFlows: {
        userPassword: true,
        userSrp: true,
      },
      preventUserExistenceErrors: true,
    });

    new cdk.CfnOutput(this, "UserPoolId", {
      value: userPool.userPoolId,
      description: "The ID of the Cognito User Pool",
    });

    new cdk.CfnOutput(this, "UserPoolClientId", {
      value: userPoolClient.userPoolClientId,
      description: "The ID of the Cognito User Pool Client (server-side)",
    });

    new cdk.CfnOutput(this, "FlutterClientId", {
      value: flutterClient.userPoolClientId,
      description: "The ID of the Cognito User Pool Client (Flutter app)",
    });
  }
}