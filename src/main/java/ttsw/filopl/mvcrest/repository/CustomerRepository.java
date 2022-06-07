package ttsw.filopl.mvcrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ttsw.filopl.mvcrest.domain.Customer;

/**
 * Created by T. Filo Zegarlicki on 07.06.2022
 **/


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
