FROM adoptopenjdk/openjdk8:jdk8u212-b04-alpine-slim

COPY app.jar /helloworld.jar

# Run the web service on container startup.
CMD ["java","-jar","/helloworld.jar"]
