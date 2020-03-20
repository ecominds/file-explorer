# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

#Changed the working directory to /opt/app
WORKDIR /opt/app

#Copy spring-boot-web.jar to /opt/app/app.jar
ARG JAR_FILE=target/spring-boot-web.jar

# cp spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

#  Run the jar file with ENTRYPOINT
# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]