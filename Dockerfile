FROM openjdk:8
ADD target/PropertyManagementSystem-1.jar PropertyManagementSystem-1.jar
ENTRYPOINT ["java", "-jar","PropertyManagementSystem-1.jar"]
EXPOSE 8080