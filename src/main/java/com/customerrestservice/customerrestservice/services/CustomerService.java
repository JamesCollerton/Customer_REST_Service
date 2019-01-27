package com.customerrestservice.customerrestservice.services;

import com.customerrestservice.customerrestservice.domain.Customer;
import com.customerrestservice.customerrestservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class implementing the business logic for interacting with customers
 *
 * TODO Testing
 */
@Service
public class CustomerService {

    /**
     * Autowired customer repository for interacting with database layer
     */
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Method for finding a customer by their Id
     *
     * TODO Extract out parsing and handling exception
     *
     * @param stringId Id of the customer we would like to find
     * @return an optional of a customer which is empty if nothing was returned
     */
    public Optional<Customer> findById(String stringId) {
        Long longId = Long.parseLong(stringId);
        return customerRepository.findById(longId);
    }

    /**
     * Update a customer with a given Id using the provided object
     *
     * TODO Way of failing if customer does not exist
     *
     * @param stringId Id of the customer to update
     * @param customerToUpdateTo Customer object we would like to update to
     */
    public void updateById(String stringId, Customer customerToUpdateTo) {
        Optional<Customer> customerToUpdateFrom = findById(stringId);
        customerToUpdateFrom.map(c -> copyCustomer(c, customerToUpdateTo)).map(customerRepository::save);
    }

    /**
     * Saves a customer to the database
     *
     * @param customer Customer we would like to save
     */
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    /**
     * Deletes a customer with a given Id
     *
     * TODO Extract out parsing and handling exception
     *
     * @param stringId The Id of the customer we would like to delete
     */
    public void deleteById(String stringId) {
        Long longId = Long.parseLong(stringId);
        customerRepository.deleteById(longId);
    }

    /**
     * Helper method for copying one customer into another.
     *
     * TODO Move out of class. Could potentially just switch the Ids too
     *
     * @param into The customer we're copying data into
     * @param from The customer we're copying data from
     * @return The customer we copied data into
     */
    private Customer copyCustomer(Customer into, Customer from) {
        into.setName(from.getName());
        into.setAge(from.getAge());
        return into;
    }

}
