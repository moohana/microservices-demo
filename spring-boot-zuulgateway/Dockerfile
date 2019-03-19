FROM openjdk:11

RUN mkdir /src

WORKDIR /src

ADD target/spring-boot-zuulgateway-0.0.1-SNAPSHOT.jar /src/spring-boot-zuulgateway-0.0.1-SNAPSHOT.jar

EXPOSE 8080

RUN sh -c 'touch /src/spring-boot-zuulgateway-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar","/src/spring-boot-zuulgateway-0.0.1-SNAPSHOT.jar"]