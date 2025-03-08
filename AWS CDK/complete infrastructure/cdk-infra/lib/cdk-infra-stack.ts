import * as cdk from 'aws-cdk-lib';
import { Construct } from 'constructs';
import * as s3 from 'aws-cdk-lib/aws-s3';
import * as elasticbeanstalk from 'aws-cdk-lib/aws-elasticbeanstalk';
import * as cognito from 'aws-cdk-lib/aws-cognito';
import * as iam from 'aws-cdk-lib/aws-iam';

export class CdkInfraStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);
    
    // Create Elastic Beanstalk application
    const application = new elasticbeanstalk.CfnApplication(this, 'Application', {
      applicationName: 'CdkTestApp-05',
    });
    
    // Create IAM role for Elastic Beanstalk instance profile
    const ebInstanceRole = new iam.Role(this, 'aws-elasticbeanstalk-ec2-role', {
      assumedBy: new iam.ServicePrincipal('ec2.amazonaws.com'),
    });
    
    ebInstanceRole.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName('AWSElasticBeanstalkWebTier')
    );
    
    ebInstanceRole.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName('AWSElasticBeanstalkWorkerTier')
    );
    
    ebInstanceRole.addManagedPolicy(
      iam.ManagedPolicy.fromAwsManagedPolicyName('AWSElasticBeanstalkMulticontainerDocker')
    );
    
    const ebInstanceProfile = new iam.CfnInstanceProfile(this, 'aws-elasticbeanstalk-ec2-profile', {
      roles: [ebInstanceRole.roleName],
    });
    
    // Create Elastic Beanstalk environment - explicitly set as single instance
    const environment = new elasticbeanstalk.CfnEnvironment(this, 'Environment', {
      environmentName: 'CdkTestEnv-05',
      applicationName: application.applicationName || 'CdkTestApp-05',
      solutionStackName: '64bit Amazon Linux 2023 v4.4.4 running Corretto 21',
      tier: {
        name: 'WebServer',
        type: 'Standard'
      },
      optionSettings: [
        {
          namespace: 'aws:elasticbeanstalk:environment',
          optionName: 'EnvironmentType',
          value: 'SingleInstance',
        },
        {
          namespace: 'aws:autoscaling:launchconfiguration',
          optionName: 'IamInstanceProfile',
          value: ebInstanceProfile.ref,
        },
        {
          namespace: 'aws:ec2:instances',
          optionName: 'InstanceTypes',
          value: 't4g.small',
        },
         // Environment Variables
         {
          namespace: 'aws:elasticbeanstalk:application:environment',
          optionName: 'JAVA_HOME',
          value: '/usr/lib/jvm/java',
        },
        {
          namespace: 'aws:elasticbeanstalk:application:environment',
          optionName: 'spring_jackson_time-zone',
          value: 'Asia/Calcutta',
        },
        {
          namespace: 'aws:elasticbeanstalk:application:environment',
          optionName: 'SERVER_PORT',
          value: '5000',
        },
      ],
    });
    
    // Make sure the environment is created after the application
    environment.addDependency(application);
  }
}