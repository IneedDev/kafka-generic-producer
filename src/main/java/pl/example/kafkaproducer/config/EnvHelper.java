package pl.example.kafkaproducer.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class EnvHelper {

    @Value("${app.name}")
    private String applicationName;

    //kafka
    @Value("${kafka.autoResetConfig}")
    private String autoResetConfig;

    @Value(value = "${kafka.bootstrapServers}")
    private String bootstrapServers;

    //customerProfile
    @Value("${kafka.producer.applicationId}")
    private String producerApplicationId;

    @Value(value = "${kafka.producer.topicName}")
    private String producerTopicName;

    @Value(value = "${kafka.producer.schemaRegistryUrl}")
    private String producerSchemaUrl;

    @Value("${szop.url}")
    private String szopUrl;
    @Value("${szop.customer-path}")
    private String szopCustomerPath;

    @Value("${szop.parcel-path}")
    private String szopParcelPath;

    @Value("${szop.parcelapi-path}")
    private String szopParcelApiPath;

    @Value("${szop.customer-attribute-path}")
    private String szopCustomerAttributePath;

    @Value("${szop.customer-limit}")
    private Integer szopCustomerLimit;

}
