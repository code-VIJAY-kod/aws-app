FROM openjdk:8
EXPOSE 8080
ADD target/aws-demo.jar aws-demo.jar
ENTRYPOINT ["java","-jar","/aws-demo.jar"]