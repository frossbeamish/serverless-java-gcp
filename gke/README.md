# HelloWorld for Google Cloud Run (Java 8)

This sample demonstrates how to deploy a Java Application on Google Cloud Platform GKE.

**Note: This example is modified from Google's [GKE Quickstart][quickstart].**

* Copied the Cloud Run Code
  * Modified the return text
* Updated the deployed image to differ from the quickstart

[quickstart]: https://cloud.google.com/kubernetes-engine/docs/quickstart

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Gradle](https://gradle.org/gradle-download/) (optional)
* [Google Cloud SDK](https://cloud.google.com/sdk/) (aka gcloud)

## Setup

Follow the [setup instruction](../README.md#setup)

## Running locally

    ./gradlew :gke:bootRun

To use visit: http://localhost:8080/

## Deploying

1. Compile, build Docker image, push Docker image to us.gcr.io, print Docker image tag:

```bash    
./gradlew :gke:deploy
```
    
2. Add deployment to GKE:

```bash
kubectl run hello-world-gke --image <IMAGE-TAG> --port 8080
```

3. Expose deployment:

```bash
kubectl expose deployment hello-world-gke --type LoadBalancer --port 80 --target-port 8080
```
    
4. Find GKE Service external ip:

```bash
kubectl get service/hello-world-gke -o=jsonpath='{$.status.loadBalancer.ingress[*].ip}'
```
    
*Note: if you don't see an ip address after running the previous command, give it a minute and try 
again.*    
    
To use visit the ip address found in the last step.

## Testing

    ./gradlew :gke:check

As you add / modify the source code (`src/main/java/...`) it's very useful to add 
[unit testing](https://cloud.google.com/appengine/docs/java/tools/localunittesting) 
to (`src/main/test/...`).  The following resources are quite useful:

* [Junit5](http://junit.org/junit5/)
* [Mockito](http://mockito.org/)
