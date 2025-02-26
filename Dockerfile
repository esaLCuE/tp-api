FROM openjdk:21
EXPOSE 9000
WORKDIR /app
COPY api-0.0.1-SNAPSHOT.jar /app/api.jar
CMD ["java", "-jar", "api.jar"]
