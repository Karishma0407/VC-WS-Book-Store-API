package dev.webservices.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.webservices.Entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
