from openjdk:11
EXPOSE 8700
ADD target/userservice.jar userservice.jar
ENTRYPOINT ["java","-jar","/userservice.jar"]