# Pipeline as Code with Axon.ivy

**Pipeline as Code** is powerful, increases quality
in your CI/CD environment and saves your valuable time.

Here we show how you can use **Pipeline as Code** with Axon.ivy.
We are using Jenkins as CI/CD build infrastructure
which provides **Pipeline as Codes** with `Jenkinsfile`.

# Setup

1. Start Jenkins

   Execute `docker-compose up` in directory `build-environment`.

2. [optional] Build maven image

   This is only for demo purpose to get fast maven builds.
   Execute `build.sh` in directory `build-environment/maven-build-container`.
   This will build a maven container with external dependencies such as Axon.ivy Engine and Maven dependencies.
