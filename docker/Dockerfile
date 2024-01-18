FROM openjdk:17
ARG JAR_FILE=build/libs/docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} docker-springboot.jar
ENTRYPOINT ["java","-jar","docker-springboot.jar"]
