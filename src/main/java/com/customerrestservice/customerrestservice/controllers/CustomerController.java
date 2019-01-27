package com.customerrestservice.customerrestservice.controllers;

import com.customerrestservice.customerrestservice.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController implements IController {

    @Override
    @GetMapping
    public ResponseEntity<Customer> get() {
        Customer customer = new Customer();
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity post(Object o) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    @PutMapping
    public ResponseEntity put() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @DeleteMapping
    public ResponseEntity delete() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
