package pl.example.kafkaproducer.config;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import pl.inpost.model.ParcelPropertyKafkaEvent;

import java.util.HashMap;
import java.util.Map;

import static io.confluent.kafka.serializers.KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG;


@Configuration
@EnableKafka
public class ProducerConfig {

    @Autowired
    private EnvHelper envHelper;

    @Bean
    public ProducerFactory<String, ParcelPropertyKafkaEvent> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(org.apache.kafka.clients.producer.ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, envHelper.getBootstrapServers());
        configProps.put(org.apache.kafka.clients.producer.ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        configProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, envHelper.getProducerSchemaUrl());
        configProps.put(SPECIFIC_AVRO_READER_CONFIG, true);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, ParcelPropertyKafkaEvent> kafkaTemplate() {
        KafkaTemplate<String, ParcelPropertyKafkaEvent> kafkaTemplate = new KafkaTemplate<>(producerFactory());
        kafkaTemplate.setDefaultTopic(envHelper.getProducerTopicName());
        return kafkaTemplate;
    }
}
