FROM openjdk:17
EXPOSE 8089
ADD target/spring-boot-docker-project.jar spring-boot-docker-project.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-project.jar"]