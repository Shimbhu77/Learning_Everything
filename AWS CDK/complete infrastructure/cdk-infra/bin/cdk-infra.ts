#!/usr/bin/env node
import 'source-map-support/register';
import * as cdk from 'aws-cdk-lib';
import { CdkInfraStack } from '../lib/cdk-infra-stack';
import { CdkCognitoStack } from '../lib/cdk-cognito-stack';
import { CdkS3Stack } from '../lib/cdk-s3-stack';
import { IamUsersStack } from '../lib/cdk-iam-stack';
import { ParameterStoreStack } from '../lib/cdk-ssm-stack';

const app = new cdk.App();
// new CdkInfraStack(app, 'CdkInfraStack', {
// });

// new CdkCognitoStack(app, 'CdkCognitoStack', {
// });

// new CdkS3Stack(app, 'CdkS3Stack', {
// });

// new IamUsersStack(app, 'IamUsersStack', {
// });

new ParameterStoreStack(app, 'ParameterStoreStack', {
});