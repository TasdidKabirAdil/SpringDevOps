FROM openjdk:17
ADD target/spring-devops.jar spring-devops.jar
LABEL authors="Reaper"

ENTRYPOINT ["java", "-jar", "spring-devops.jar"]