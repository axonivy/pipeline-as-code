# Pipeline as Code with Axon.ivy

Pipeline as Code is powerful, increase the quality
and saves time.

Here we use Jenkins as CI/CD build infrastructure.
Jenkins provides Pipeline as Codes with Jenkinsfile.

# Setup

1. Start Jenkins

   Execute `docker-compose up` in `build-environment`.

2. [optional] Build maven image

   This is only for demo purpose to get fast maven builds.
   Execute `./build-environment/maven-build-container/build.sh`.
   This will build a maven container with external dependencies such as
   Axon.ivy Engine and Maven dependencies.
