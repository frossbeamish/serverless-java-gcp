# Serverless Java GCP

This repository houses code examples to demonstrate how to do serverless Java on the Google Cloud 
Platform.

[Presentation](https://docs.google.com/presentation/d/1Mr_E9RKWirlRMcYtNDEAs436kMarD_E3kQAoK-vsIHw/edit?usp=sharing)

## Setup

1. Create a [Google Account](https://accounts.google.com) if you do not already have one.
2. Sign up for a [Google Cloud Platform Account](https://console.cloud.google.com) if you do not 
already have one.
3. Download and initialize the [gcloud sdk](https://cloud.google.com/sdk/):

```bash
gcloud init
```

4. Determine your Google Cloud Billing Account Id:

```bash    
gcloud beta billing accounts list
```

5. Determine your Google Cloud Project Id (remember: these are globally unique).    
6. Create some environment variables:

```bash
export BILLING_ACCOUNT=<BILLING-ACCOUNT-ID>
export PROJECT_ID=<PROJECT-ID> 
```
    
7. Create the Google Cloud Project:

```bash
gcloud projects create $PROJECT_ID --set-as-default
```

8. Enable billing on your Google Cloud Project:

```bash
gcloud beta billing projects link $PROJECT_ID --billing-account $BILLING_ACCOUNT >> /dev/null
```
    
9. Enable the necessary Google Cloud Platform Services:

```bash
gcloud services enable containerregistry.googleapis.com
gcloud services enable container.googleapis.com
gcloud services enable run.googleapis.com
```
    
10. Create the Google Cloud Platform resources for this example:

```bash
gcloud app create --region=us-central
gcloud container clusters create $PROJECT_ID
gcloud container clusters get-credentials $PROJECT_ID
```

## Modules

* [Cloud Functions](cloud-function)
* [App Engine](app-engine)
* [Cloud Run](cloud-run)
* [GKE](gke)

## Tear Down

1. Delete your Google Cloud Project:

```bash
gcloud projects delete $PROJECT_ID
```
 
2. Unset your environment variables:

```bash
unset BILLING_ACCOUNT
unset PROJECT_ID
```
