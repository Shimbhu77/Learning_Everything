// #!/usr/bin/env node
// import 'source-map-support/register';
// import * as cdk from 'aws-cdk-lib';
// import { AwsVideoOnDemandStack } from '../lib/aws-video-on-demand-stack';

// const app = new cdk.App();
// new AwsVideoOnDemandStack(app, 'AwsVideoOnDemandStack', {
//   /* If you don't specify 'env', this stack will be environment-agnostic.
//    * Account/Region-dependent features and context lookups will not work,
//    * but a single synthesized template can be deployed anywhere. */

//   /* Uncomment the next line to specialize this stack for the AWS Account
//    * and Region that are implied by the current CLI configuration. */
//   // env: { account: process.env.CDK_DEFAULT_ACCOUNT, region: process.env.CDK_DEFAULT_REGION },

//   /* Uncomment the next line if you know exactly what Account and Region you
//    * want to deploy the stack to. */
//   // env: { account: '123456789012', region: 'us-east-1' },

//   /* For more information, see https://docs.aws.amazon.com/cdk/latest/guide/environments.html */
// });


/**
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  SPDX-License-Identifier: Apache-2.0
 */

import 'source-map-support/register';
import * as cdk from 'aws-cdk-lib';
import { DefaultStackSynthesizer } from 'aws-cdk-lib';
import { AwsSolutionsChecks } from 'cdk-nag';
import { VodFoundation } from '../lib/aws-video-on-demand-stack';

function createVodFoundationApp(app: cdk.App) {
  return new VodFoundation(app, 'VodFoundation', {
    synthesizer: new DefaultStackSynthesizer({
      generateBootstrapVersionRule: false
    })
  });
}

const app = new cdk.App();

createVodFoundationApp(app);

//cdk nag
cdk.Aspects.of(app).add(new AwsSolutionsChecks({ verbose: true }));