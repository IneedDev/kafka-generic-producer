package pl.example.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.example.kafkaproducer.config.EnvHelper;
import pl.inpost.szop.customer.CustomerPrivateApiVO;
import pl.inpost.szop.customer.GetCustomersResponse;
import pl.inpost.szop.parcelwsservice.CreateParcelsResponse;
import pl.inpost.szop.publicapi.CreateParcels;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SzopServiceImpl {

    private final EnvHelper enviromentHelper;
    private final SzopCustomerFacadeClient szopCustomer;
    private final SzopParcelClient szopParcelClient;
    private final SzopPublicApiClient szopPublicApiClient;



    public List<CustomerPrivateApiVO> getCustomersWithNip(int requestNr) {
        int pagingOffset = SzopCustomerUtils.getCurrentOffset(requestNr, enviromentHelper.getSzopCustomerLimit());
        GetCustomersResponse response = szopCustomer.callGetCustomers(pagingOffset, enviromentHelper.getSzopCustomerLimit());
        return SzopCustomerUtils.getOnlyWithInvoiceAndNip(response);
    }

    public CreateParcelsResponse createParcels() {
        CreateParcelsResponse response = szopParcelClient.callCreateParcels();
        return response;
    }

    public CreateParcels createParcelsWithApi() {
        pl.inpost.szop.publicapi.CreateParcels response = szopPublicApiClient.callCreateParcels();
        return response;
    }
}
