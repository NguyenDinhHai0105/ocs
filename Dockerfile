FROM openjdk:11
ADD target/ocs-preparation-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]