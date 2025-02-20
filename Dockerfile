FROM openjdk:21
EXPOSE 9000
WORKDIR /app
COPY out/artifacts/api_jar/api.jar /app/api.jar
CMD ["java", "-jar", "api.jar"]