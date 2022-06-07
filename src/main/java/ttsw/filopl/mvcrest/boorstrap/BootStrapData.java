package ttsw.filopl.mvcrest.boorstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ttsw.filopl.mvcrest.domain.Customer;
import ttsw.filopl.mvcrest.repository.CustomerRepository;

/**
 * Created by T. Filo Zegarlicki on 07.06.2022
 **/

@Slf4j
@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Load data ....");
        Customer c1 = new Customer();
        c1.setFirstName("Dzik");
        c1.setLastName("Dziki");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Pinarello");
        c2.setLastName("Dogma");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Ultegra");
        c3.setLastName("Shimano");
        customerRepository.save(c3);

        log.info("Customer Saved: " + customerRepository.count());
    }
}
