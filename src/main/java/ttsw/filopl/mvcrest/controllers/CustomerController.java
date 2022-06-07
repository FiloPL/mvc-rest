package ttsw.filopl.mvcrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ttsw.filopl.mvcrest.domain.Customer;
import ttsw.filopl.mvcrest.services.CustomerService;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 07.06.2022
 **/

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/customers";
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return customerService.findAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustmoerbByID( @PathVariable Long id) {
        return customerService.findCustomerByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
