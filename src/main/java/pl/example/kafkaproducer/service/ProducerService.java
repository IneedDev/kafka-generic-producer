package pl.example.kafkaproducer.service;

import pl.example.kafkaproducer.model.ParcelProfile;

public interface ProducerService {

    void sendMessage(ParcelProfile parcelProfile);

}
