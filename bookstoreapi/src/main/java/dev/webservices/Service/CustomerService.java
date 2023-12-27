package dev.webservices.Service;

import java.util.Optional;

import dev.webservices.Entity.Customer;

public interface CustomerService {

    Customer save(Customer Customer);

    Optional<Customer> findById(Long id);
}
