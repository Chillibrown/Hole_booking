FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean packege -DskipTests

FROM eclipse-temurin:17-alpine
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "Java", "jar", "app.jar" ]