package pl.example.kafkaproducer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.kafkaproducer.model.ParcelProfile;
import pl.example.kafkaproducer.service.impl.ProducerServiceImpl;
import pl.example.kafkaproducer.service.SzopServiceImpl;

@RestController
@RequestMapping(value = "/parcel")
public class KafkaController {

    @Autowired
    private SzopServiceImpl szopService;

    @Autowired
    private ProducerServiceImpl producerServiceImpl;

    KafkaController(ProducerServiceImpl producerServiceImpl) {
        this.producerServiceImpl = producerServiceImpl;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody ParcelProfile parcelProfile) throws JsonProcessingException {
        System.out.println("dssd");
//        szopService.getCustomersWithNip(10);
//        szopService.createParcels();
//        szopService.createParcelsWithApi();
        this.producerServiceImpl.sendMessage(parcelProfile);
    }

}
