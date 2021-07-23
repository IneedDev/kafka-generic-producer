package pl.example.kafkaproducer.service;

import pl.inpost.szop.customer.CustomerPrivateApiVO;
import pl.inpost.szop.customer.GetCustomersResponse;
import pl.inpost.szop.customer.PagingVO;

import java.util.List;
import java.util.stream.Collectors;

public class SzopCustomerUtils {
    public static List<CustomerPrivateApiVO> getOnlyWithInvoiceAndNip(GetCustomersResponse response) {
        List<CustomerPrivateApiVO> voList = (List<CustomerPrivateApiVO>) (Object) response.getCustomers().getResult();
        return voList.stream()
            .filter(customer -> customer.getInvoice() != null && customer.getInvoice().getNip() != null)
            .collect(Collectors.toList());
    }

    public static int getCurrentOffset(int currentRequestOrder, int limit) {
        return currentRequestOrder * limit;
    }


    public static PagingVO newPaging(int limit, int offset) {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setLimit(limit);
        pagingVO.setOffset(offset);
        return pagingVO;
    }
}