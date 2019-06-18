# HelloWorld for Google Cloud Run (Java 8)

This sample demonstrates how to deploy a Java Application on Google Cloud Run.

**Note: This example is largely copied from Google's [Cloud Run Quickstart][quickstart].**

* Updated to Gradle Only
* Junit 5

[quickstart]: https://cloud.google.com/run/docs/quickstarts/build-and-deploy

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Gradle](https://gradle.org/gradle-download/) (optional)
* [Google Cloud SDK](https://cloud.google.com/sdk/) (aka gcloud)

## Setup

Follow the [setup instruction](../README.md#setup)

## Running locally

    ./gradlew :cloud-run:bootRun

To use visit: http://localhost:8080/

## Deploying

    ./gradlew :cloud-run:deploy

To use visit the Google Cloud Run URL output at the end of the command.

## Testing

    ./gradlew :cloud-run:check

As you add / modify the source code (`src/main/java/...`) it's very useful to add 
[unit testing](https://cloud.google.com/appengine/docs/java/tools/localunittesting) 
to (`src/main/test/...`).  The following resources are quite useful:

* [Junit5](http://junit.org/junit5/)
* [Mockito](http://mockito.org/)
