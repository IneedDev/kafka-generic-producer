package pl.example.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import org.springframework.ws.soap.client.core.SoapActionCallback;
import pl.example.kafkaproducer.config.EnvHelper;
import pl.inpost.szop.customer.GetCustomers;
import pl.inpost.szop.customer.GetCustomersResponse;
import pl.inpost.szop.customer.ObjectFactory;

import javax.xml.bind.JAXBElement;

@Component
@Slf4j
public class SzopCustomerFacadeClient extends WebServiceGatewaySupport {

    private static String CUSTOMER_URL;


    public SzopCustomerFacadeClient(EnvHelper enviromentHelper) {
        CUSTOMER_URL = enviromentHelper.getSzopUrl() + enviromentHelper.getSzopCustomerPath();
    }

    public GetCustomersResponse callGetCustomers(int offset, int limit) {
        GetCustomers request = new GetCustomers();
        request.setActive(true);
        request.setPaging(SzopCustomerUtils.newPaging(limit, offset));
        JAXBElement<GetCustomersResponse> element = (JAXBElement<GetCustomersResponse>) getWebServiceTemplate()
            .marshalSendAndReceive(CUSTOMER_URL, new ObjectFactory().createGetCustomers(request),
                new SoapActionCallback("getCustomers"));
        log.debug("SzopCustomerFacadeClient called: {}", element.getValue().getCustomers().getCount());
        return element.getValue();
    }
}
