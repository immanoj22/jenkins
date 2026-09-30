FROM openjdk:21-jdk
ADD target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-0.0.1-SNAPSHOT.jar"]
EXPOSE 5000