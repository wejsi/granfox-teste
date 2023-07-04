
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ms-registro-produtos-app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/ms-registro-produtos.jar"]


#ADD ./target/*.jar /usr/src/ms-registro-produtos.jar
#WORKDIR usr/src
#ENTRYPOINT ["java","-jar", "ms-registro-produtos.jar"]