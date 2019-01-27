package com.customerrestservice.customerrestservice.controllers;

import com.customerrestservice.customerrestservice.domain.Customer;
import com.customerrestservice.customerrestservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller for interaction with customers
 *
 * TODO Logging
 * TODO Swagger
 * TODO Exception handler
 * TODO Testing
 */
@Controller
@RequestMapping("/customers")
public class CustomerController implements IController<Customer> {

    /**
     * Autowired service for business logic and abstraction of repository layer from controller
     */
    @Autowired
    private CustomerService customerService;

    /**
     * Called when we use GET on the controller. Retrieves a resource.
     *
     * @param id Id of the resource we are retrieving
     * @return A response entity with the appropriate HTTP Status code and object
     */
    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> get(@PathVariable String id) {
        Optional<Customer> customer = customerService.findById(id);
        return customer
                .map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Called when we use POST on the controller. Creates a resource.
     *
     * @param customer Object we would like to create
     * @return A response entity with the appropriate HTTP Status code and object
     */
    @Override
    @PostMapping
    public ResponseEntity<Customer> post(@RequestBody Customer customer) {
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    /**
     * Called when we use PUT on the controller. Updates a resource given an Id.
     *
     * @param id Id of the resource we are updating
     * @param customer Object we would like to update to
     * @return A response entity with the appropriate HTTP Status code
     */
    @Override
    @PutMapping(value = "/{id}")
    public ResponseEntity put(@PathVariable String id, @RequestBody Customer customer) {
        customerService.updateById(id, customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Called when we use DELETE on the controller. Deletes a resource given an Id.
     *
     * @param id Id of the resource we are deleting
     * @return A response entity with the appropriate HTTP Status code
     */
    @Override
    @DeleteMapping
    public ResponseEntity delete(String id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
