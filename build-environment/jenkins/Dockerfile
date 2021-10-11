FROM jenkins/jenkins

# no setup wizard
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

# setup admin user
COPY admin.groovy /usr/share/jenkins/ref/init.groovy.d/

# install plugins
COPY plugins.txt /usr/share/jenkins/
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/plugins.txt

# install docker cli tool
USER root
RUN apt-get update -qq \
    && apt-get install -qqy apt-transport-https ca-certificates curl gnupg2 software-properties-common 
RUN curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add -
RUN add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/debian \
   $(lsb_release -cs) \
   stable"
RUN apt-get update  -qq \
    && apt-get install docker-ce -y
RUN usermod -aG docker jenkins

# preconfigure jobs
COPY jobs /usr/share/jenkins/ref/jobs
