FROM openjdk:8
EXPOSE 8080
ADD target/aws-app.jar aws-app.jar
ENTRYPOINT ["java","-jar","/aws-app.jar"]