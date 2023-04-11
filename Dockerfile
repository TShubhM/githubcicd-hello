FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/hello-cicd.jar hello-cicd.jar
ENTRYPOINT ["java", "-jar", "/hello-cicd.jar"]