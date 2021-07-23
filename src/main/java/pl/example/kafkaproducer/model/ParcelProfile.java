package pl.example.kafkaproducer.model;

import lombok.Data;

import java.util.List;

@Data
public class ParcelProfile {

    private List<String> parcelCodes;
    private List<String> value;

}
