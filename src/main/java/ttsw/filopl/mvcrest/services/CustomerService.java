package ttsw.filopl.mvcrest.services;

import ttsw.filopl.mvcrest.domain.Customer;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 07.06.2022
 **/

public interface CustomerService {
    Customer findCustomerByID( Long id);
    List<Customer> findAllCustomer();

    Customer saveCustomer(Customer customer);
}
