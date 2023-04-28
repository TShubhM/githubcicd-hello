FROM openjdk:21-ea-13-jdk-slim
EXPOSE 8080
ADD target/hello-cicd.jar hello-cicd.jar
ENTRYPOINT ["java", "-jar", "/hello-cicd.jar"]