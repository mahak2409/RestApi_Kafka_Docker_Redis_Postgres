FROM openjdk:11
ADD ./target/demoRest-0.0.1-SNAPSHOT.jar /usr/src/demoRest-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "demoRest-0.0.1-SNAPSHOT.jar"]
