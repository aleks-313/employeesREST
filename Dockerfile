FROM openjdk:17
LABEL authors="Aleks"
ADD target/employees_rest-1.0.jar employees_rest-1.0.jar
ENTRYPOINT ["java", "-jar", "/employees_rest-1.0.jar"]