FROM openjdk:17
COPY target/DockerProject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","DockerProject-0.0.1-SNAPSHOT.jar"]
