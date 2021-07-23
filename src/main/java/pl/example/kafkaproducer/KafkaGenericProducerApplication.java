package pl.example.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication
public class KafkaGenericProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaGenericProducerApplication.class, args);
    }

}
