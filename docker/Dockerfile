FROM docker.easypack24.net:5000/inpost/corretto-jdk11:11.0.3.7.1.GA
VOLUME /tmp
ADD temp/*.jar /opt/kafka-generic-producer.jar
ENTRYPOINT ["java","-jar","opt/kafka-generic-producer.jar"]