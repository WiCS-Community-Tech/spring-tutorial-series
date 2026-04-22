FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY gradlew settings.gradle build.gradle /app/
COPY gradle /app/gradle
COPY src /app/src
RUN ./gradlew bootJar
EXPOSE 8080
CMD ["java", "-jar", "build/libs/amazingCo.jar"]
