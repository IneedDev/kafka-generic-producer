package pl.example.kafkaproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import pl.example.kafkaproducer.service.SzopCustomerFacadeClient;
import pl.example.kafkaproducer.service.SzopParcelClient;
import pl.example.kafkaproducer.service.SzopPublicApiClient;

@Configuration
@RequiredArgsConstructor
public class WebServiceConsumerConfig {
    private final EnvHelper enviromentHelper;

    private String ContextPath = "pl.inpost.szop.customer";
    private String ContextPathParcels = "pl.inpost.szop.parcelwsservice";
    private String ContextPathParcelsApi = "pl.inpost.szop.publicapi";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ContextPath);
        marshaller.setCheckForXmlRootElement(false);
        return marshaller;
    }

    @Bean
    public Jaxb2Marshaller marshallerParcels() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ContextPathParcels);
        marshaller.setCheckForXmlRootElement(false);
        return marshaller;
    }

    @Bean
    public Jaxb2Marshaller marshallerParcelsApi() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ContextPathParcelsApi);
        marshaller.setCheckForXmlRootElement(false);
        return marshaller;
    }

    @Bean
    public SzopCustomerFacadeClient szopCustomer(Jaxb2Marshaller marshaller) {
        SzopCustomerFacadeClient client = new SzopCustomerFacadeClient(enviromentHelper);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public SzopParcelClient szopParcel(Jaxb2Marshaller marshallerParcels) {
        SzopParcelClient client = new SzopParcelClient(enviromentHelper);
        client.setMarshaller(marshallerParcels);
        client.setUnmarshaller(marshallerParcels);
        return client;
    }

    @Bean
    public SzopPublicApiClient szopParcelApi(Jaxb2Marshaller marshallerParcelsApi) {
        SzopPublicApiClient client = new SzopPublicApiClient(enviromentHelper);
        client.setMarshaller(marshallerParcelsApi);
        client.setUnmarshaller(marshallerParcelsApi);
        return client;
    }

}
