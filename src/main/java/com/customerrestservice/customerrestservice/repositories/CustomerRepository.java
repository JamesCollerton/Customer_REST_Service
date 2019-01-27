package com.customerrestservice.customerrestservice.repositories;

import com.customerrestservice.customerrestservice.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This is the DAO layer for the customer repository.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
