FROM maven:3.6.2-jdk-11-slim

RUN apt-get update && apt-get install -y unzip

# for demo purpose, fast builds
# we cache external dependencies

# cache Axon.ivy Engine
RUN curl -L https://developer.axonivy.com/permalink/nightly/axonivy-engine-slim.zip -o /tmp/engine.zip && \
    unzip /tmp/engine.zip -d /tmp/engine && \
    rm /tmp/engine.zip

# cache maven dependencies
ADD quick-start-tutorial /tmp/project
ADD quick-start-tutorial-test /tmp/project-test

RUN mvn -f /tmp/project install dependency:go-offline -B && \
    mvn -f /tmp/project-test verify dependency:go-offline -B
