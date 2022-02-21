FROM maven:3.8.4-openjdk-17-slim AS build
COPY src /server/src
COPY pom.xml /server
RUN mvn -f /server/pom.xml clean package
EXPOSE 4567
ENTRYPOINT ["java", "-jar","/app/target/lesson_3-1.0-SNAPSHOT.jar"]