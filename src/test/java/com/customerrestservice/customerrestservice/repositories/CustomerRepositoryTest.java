package com.customerrestservice.customerrestservice.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Placeholder test class for testing the repository.
 *
 * Annotation @DataJPATest: Annotation can be used in combination with @RunWith(SpringRunner.class) for a typical JPA test. Can
 * be used when a test focuses only on JPA components. Using this annotation will disable full auto-configuration and
 * instead apply only configuration relevant to JPA tests.
 *
 * By default, tests annotated with @DataJpaTest will use an embedded in-memory database.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void given_when_then() {

    }

}