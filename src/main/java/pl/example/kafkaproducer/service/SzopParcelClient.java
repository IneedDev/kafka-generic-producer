package pl.example.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import pl.example.kafkaproducer.config.EnvHelper;
import pl.inpost.szop.parcelwsservice.*;

import javax.xml.bind.JAXBElement;

@Slf4j
public class SzopParcelClient extends WebServiceGatewaySupport {

    private static String PARCEL_URL;

    public SzopParcelClient(EnvHelper enviromentHelper) {
        PARCEL_URL = enviromentHelper.getSzopUrl() + enviromentHelper.getSzopParcelPath();
    }

    public CreateParcelsResponse callCreateParcels() {

        pl.inpost.szop.parcelwsservice.CreateParcels createParcels = new pl.inpost.szop.parcelwsservice.CreateParcels();
//        createParcels

        ParcelApiVO parcelApiVO = new ParcelApiVO();
        parcelApiVO.setAddresseeEmail("receiver@easypack.com");
        parcelApiVO.setSenderEmail("sender@easypack.com");
        parcelApiVO.setPhoneNumber("537398895");
        parcelApiVO.setBoxMachineName("BoxMachineName1");

        JAXBElement<CreateParcelsResponse> element = (JAXBElement<CreateParcelsResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(PARCEL_URL, new ObjectFactory().createCreateParcels(createParcels), new SoapActionCallback("createParcels"));
        log.debug("SzopCustomerFacadeClient called: {}", element.getValue().getStatuses());
        return element.getValue();
    }

    class CreateParcels {

    }
}
