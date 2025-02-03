FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/hall-booking-system-0.0.1-SNAPSHOT.jar hall-booking-system.jar
CMD ["java", "-jar", "/app/hall-booking-system.jar"]

