FROM openjdk:latest
VOLUME /tmp
EXPOSE 80
RUN mkdir /tmp/images/
COPY src/main/resources/images/ /tmp/images/
ADD target/bimash-0.0.1-SNAPSHOT.jar bimash-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bimash-0.0.1-SNAPSHOT.jar"]
