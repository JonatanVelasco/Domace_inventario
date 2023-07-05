FROM openjdk:11.0-jdk-slim-stretch

ARG DEPENDENCY=target

COPY ${DEPENDENCY}/sm-core-logic-publisher.jar /sm-core-logic-publisher.jar
 
ENTRYPOINT   [ "java","-jar","-Dspring.profiles.active=release", "-Duser.timezone=America/Bogota","/sm-core-logic-publisher.jar" ]