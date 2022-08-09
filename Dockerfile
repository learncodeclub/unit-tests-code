FROM openjdk:11
ADD target/tests-0.0.1-SNAPSHOT.jar tests.jar
ENTRYPOINT ["java", "-jar", "tests.jar"]