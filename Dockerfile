FROM eclipse-temurin:21.0.4_7-jre
MAINTAINER "Abhishek M"
COPY target/tms-service-gateway.jar  /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]
