package com.customerrestservice.customerrestservice.services;

import com.customerrestservice.customerrestservice.domain.Customer;
import com.customerrestservice.customerrestservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class implementing the business logic for interacting with customers
 *
 * TODO Logging
 * TODO Testing
 */
@Service
public class CustomerService {

    /**
     * Autowired customer repository for interacting with database layer
     */
    @Autowired
    private CustomerRepository customerRepository;

    /*
        TODO Extract out parsing and handling exception
     */
    public Optional<Customer> findById(String stringId) {
        Long longId = Long.parseLong(stringId);
        return customerRepository.findById(longId);
    }

    /*
        TODO Way of failing
     */
    public void updateById(String stringId, Customer customerToUpdateTo) {
        Optional<Customer> customerToUpdateFrom = findById(stringId);
        customerToUpdateFrom.map(c -> copyCustomer(c, customerToUpdateTo)).map(customerRepository::save);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteById(String stringId) {
        Long longId = Long.parseLong(stringId);
        customerRepository.deleteById(longId);
    }

    /*
        TODO Move out of class
     */
    private Customer copyCustomer(Customer from, Customer to) {
        from.setName(to.getName());
        from.setAge(to.getAge());
        return from;
    }

}
