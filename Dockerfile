FROM openjdk:19
LABEL maintainer="jfs.com"
ADD target/java_web_final_project-0.0.1-SNAPSHOT.jar java_web.jar
ENTRYPOINT ["java", "-jar", "java_web.jar"]