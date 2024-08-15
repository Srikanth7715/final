FROM openjdk:17
EXPOSE 8080
ADD target/sample-0.0.1-SNAPSHOT.jar sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sample-0.0.1-SNAPSHOT.jar"]