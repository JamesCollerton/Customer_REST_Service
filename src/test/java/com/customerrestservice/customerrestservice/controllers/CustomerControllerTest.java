package com.customerrestservice.customerrestservice.controllers;

import com.customerrestservice.customerrestservice.CustomerrestserviceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * This is a place holder test class. If we wanted to test the end points we could do so by
 * using MockMVC.
 *
 * Annotation @RunWith(SpringRunner.class): Uses the Spring test runner support
 * Annotation @SpringBootTest(classes = CustomerrestserviceApplication.class): Looks for main application class
 * Annotation @WebAppConfiguration: Declares that the ApplicationContext loaded for an integration test should be a WebApplicationContext.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class CustomerControllerTest {

    @Test
    public void given_when_then() {

    }

}