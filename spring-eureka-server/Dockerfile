FROM openjdk:11

RUN mkdir /src

WORKDIR /src

ADD target/spring-eureka-server-0.0.1-SNAPSHOT.jar /src/spring-eureka-server-0.0.1-SNAPSHOT.jar

EXPOSE 8761

RUN sh -c 'touch /src/spring-eureka-server-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar","/src/spring-eureka-server-0.0.1-SNAPSHOT.jar"]