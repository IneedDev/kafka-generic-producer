package pl.example.kafkaproducer.service.impl;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pl.example.kafkaproducer.config.EnvHelper;
import pl.example.kafkaproducer.model.ParcelProfile;
import pl.example.kafkaproducer.service.ProducerService;
import pl.inpost.model.ParcelPropertyEventData;
import pl.inpost.model.ParcelPropertyEventHeaders;
import pl.inpost.model.ParcelPropertyKafkaEvent;
import pl.inpost.model.PropertyKeyEnum;

import java.util.Random;
import java.util.UUID;

@Data
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private EnvHelper envHelper;

    private final KafkaTemplate<String, ParcelPropertyKafkaEvent> kafkaTemplate;

    @Override
    public void sendMessage(ParcelProfile parcelProfile) {

        for (int i = 0; i < parcelProfile.getParcelCodes().size(); i++) {
            boolean value = new Random().nextBoolean();
            int phoneNumber = generateRandomDigits(9);
            String eventId = String.valueOf(UUID.randomUUID());
            ParcelPropertyEventData parcelPropertyEventData = new ParcelPropertyEventData();
            parcelPropertyEventData.setParcelNumber(parcelProfile.getParcelCodes().get(i));
            parcelPropertyEventData.setPhoneNumber(String.valueOf(phoneNumber));
            parcelPropertyEventData.setPropertyKey(PropertyKeyEnum.EASY_ACCESS_ZONE_PREFERRED);
            parcelPropertyEventData.setPropertyValue(parcelProfile.getValue().get(i));
            parcelPropertyEventData.setModificationDate(DateTime.now());

            ParcelPropertyEventHeaders parcelPropertyEventHeaders = new ParcelPropertyEventHeaders();
            parcelPropertyEventHeaders.setEventId(eventId);
            parcelPropertyEventHeaders.setEventDate(DateTime.now().toString());

            ParcelPropertyKafkaEvent parcelPropertyKafkaEvent = new ParcelPropertyKafkaEvent();
            parcelPropertyKafkaEvent.setEventData(parcelPropertyEventData);
            parcelPropertyKafkaEvent.setEventHeaders(parcelPropertyEventHeaders);

            kafkaTemplate.send(envHelper.getProducerTopicName(), eventId, parcelPropertyKafkaEvent);
        }
    }

    public static int generateRandomDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }
}
