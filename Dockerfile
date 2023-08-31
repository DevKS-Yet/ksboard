FROM openjdk:17-jdk-slim
LABEL authors="ksang"
ADD /build/libs/*.jar ksang0324/board.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/ksang0324/board.jar"]