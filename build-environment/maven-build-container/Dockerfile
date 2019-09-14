FROM maven:3.6.2-jdk-11-slim

RUN apt-get update && apt-get install -y unzip

# for demo purpose, fast builds
# we cache external dependencies

# cache Axon.ivy Engine
RUN curl -L https://developer.axonivy.com/permalink/nightly/axonivy-engine-slim.zip -o /tmp/engine.zip && \
    unzip /tmp/engine.zip -d /tmp/engine && \
    rm /tmp/engine.zip

# cache maven dependencies
ADD . /tmp/project
RUN mvn -f /tmp/project verify dependency:go-offline -B
