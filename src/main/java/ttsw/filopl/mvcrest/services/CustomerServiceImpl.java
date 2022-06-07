package ttsw.filopl.mvcrest.services;

import org.springframework.stereotype.Service;
import ttsw.filopl.mvcrest.domain.Customer;
import ttsw.filopl.mvcrest.repository.CustomerRepository;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 07.06.2022
 **/

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerByID(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
