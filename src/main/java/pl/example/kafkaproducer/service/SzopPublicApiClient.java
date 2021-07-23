package pl.example.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import pl.example.kafkaproducer.config.EnvHelper;
import pl.inpost.szop.publicapi.*;

import javax.xml.bind.JAXBElement;

@Slf4j
public class SzopPublicApiClient extends WebServiceGatewaySupport {

    private static String PUBLIC_API_URL;

    public SzopPublicApiClient(EnvHelper enviromentHelper) {
        PUBLIC_API_URL = enviromentHelper.getSzopUrl() + enviromentHelper.getSzopParcelApiPath();
    }

    public CreateParcels callCreateParcels() {
        ParcelApiVO parcelApiVO = new ParcelApiVO();
        parcelApiVO.setTmpId(1);
        parcelApiVO.setAddresseeEmail("receiver@easypack.com");
        parcelApiVO.setSenderEmail("sender@easypack.com");
        parcelApiVO.setPhoneNumber("000000000");
        parcelApiVO.setBoxMachineName("BoxMachineName1");
        parcelApiVO.setSize(DeliveryPackType.A);

        ParcelAttributeVO parcelAttributeVO = new ParcelAttributeVO();
        parcelAttributeVO.setName("tets");
        parcelAttributeVO.setName("ds");

        CreateParcels createParcels = new CreateParcels();
        createParcels.getParcel().add(parcelApiVO);
        createParcels.getParcelAttribute().add(parcelAttributeVO);

        JAXBElement<CreateParcels> element = (JAXBElement<CreateParcels>) getWebServiceTemplate()
                .marshalSendAndReceive(PUBLIC_API_URL, new ObjectFactory().createCreateParcels(createParcels), new SoapActionCallback("createParcels"));
        log.debug("SzopCustomerFacadeClient called: {}", element.getValue());
        return element.getValue();
    }
}
