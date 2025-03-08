import * as cdk from "aws-cdk-lib";
import { Construct } from "constructs";
import * as ssm from "aws-cdk-lib/aws-ssm";


export class ParameterStoreStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

    // String parameter (plain text)
    // new ssm.StringParameter(this, "SimpleStringParameter", {
    //   parameterName: "/myapp/dev/database/url",
    //   stringValue: "mysql://db.example.com:3306/mydb",
    //   description: "Database connection URL",
    //   tier: ssm.ParameterTier.STANDARD,
    // });

    // String parameter (secure string)
    new ssm.StringParameter(this, "SecureStringParameter", {
      parameterName: "NAME",
      stringValue: "SHIMBHU",
      description: "My Name",
      tier: ssm.ParameterTier.STANDARD
    });

    // String list parameter
    // new ssm.StringListParameter(this, "StringListParameter", {
    //   parameterName: "/myapp/dev/allowed-origins",
    //   stringListValue: [
    //     "https://example.com", 
    //     "https://dev.example.com", 
    //     "https://test.example.com"
    //   ],
    //   description: "Allowed CORS origins",
    // });

    // Parameters with hierarchical names
    // new ssm.StringParameter(this, "HierarchicalApiKey", {
    //   parameterName: "/myapp/dev/api/key",
    //   stringValue: "api-key-12345",
    //   description: "API key for third-party service",
    // });

    // Advanced parameter (higher throughput)
    // new ssm.StringParameter(this, "AdvancedParameter", {
    //   parameterName: "/myapp/dev/config",
    //   stringValue: JSON.stringify({
    //     timeout: 30,
    //     maxConnections: 100,
    //     retryAttempts: 3,
    //   }),
    //   description: "Application configuration",
    //   tier: ssm.ParameterTier.ADVANCED,
    // });
  }
}