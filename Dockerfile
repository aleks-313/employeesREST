FROM maven:3.8.3-openjdk-17 AS build
LABEL authors="Aleks"
WORKDIR /home/app
COPY src ./src
COPY pom.xml .
RUN mvn clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/home/app/target/employeesREST.jar"]
