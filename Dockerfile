FROM eclipse-temurin:20-jdk-alpine
MAINTAINER keshav.dube
VOLUME /tmp
COPY expenseTracker/target/expenseTracker-0.0.1-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
