# HelloWorld for App Engine Standard (Java 8)

This sample demonstrates how to deploy a Java Application on Google App Engine.

**Note: This example is largely copied from [Google's Getting Started][getting-started].**

* Updated to Gradle Only
* Junit 5

See the [Google App Engine standard environment documentation][ae-docs] for more detailed 
instructions.

[getting-started]: https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/helloworld
[ae-docs]: https://cloud.google.com/appengine/docs/java/

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Gradle](https://gradle.org/gradle-download/) (optional)
* [Google Cloud SDK](https://cloud.google.com/sdk/) (aka gcloud)

## Setup

Follow the [setup instruction](../README.md#setup)

## Running locally

    ./gradlew :app-engine:appengineRun

To use visit: http://localhost:8080/

## Deploying

    ./gradlew :app-engine:deploy

To use vist:  https://YOUR-PROJECT-ID.appspot.com

## Testing

    ./gradlew :app-engine:check

As you add / modify the source code (`src/main/java/...`) it's very useful to add 
[unit testing](https://cloud.google.com/appengine/docs/java/tools/localunittesting) 
to (`src/main/test/...`).  The following resources are quite useful:

* [Junit5](http://junit.org/junit5/)
* [Mockito](http://mockito.org/)
