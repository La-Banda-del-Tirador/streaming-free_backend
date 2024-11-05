
FROM maven:3.8.7-eclipse-temurin-17 AS builder


WORKDIR /app


COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests


FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 80

ENV SERVER_PORT=80

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
