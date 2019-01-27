package com.customerrestservice.customerrestservice.domain;

import javax.persistence.*;

/**
 * This maps to a customer entity in the database
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

}
