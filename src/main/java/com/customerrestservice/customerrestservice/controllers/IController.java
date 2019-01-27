package com.customerrestservice.customerrestservice.controllers;

import org.springframework.http.ResponseEntity;

/**
 * This is an interface surrounding the functionality of controllers
 *
 * @param <ResponseObject> The object we intend to return when we call the GET or POST methods
 */
public interface IController<ResponseObject> {

    /**
     * Called when we use GET on the controller. Retrieves a resource.
     *
     * @return A response entity with the appropriate HTTP Status code and object
     */
    ResponseEntity<ResponseObject> get();

    /**
     * Called when we use POST on the controller. Creates a resource.
     *
     * @return A response entity with the appropriate HTTP Status code and object
     */
    ResponseEntity<ResponseObject> post(ResponseObject responseObject);

    /**
     * Called when we use PUT on the controller. Updates a resource given an Id.
     *
     * @return A response entity with the appropriate HTTP Status code
     */
    ResponseEntity put();

    /**
     * Called when we use DELETE on the controller. Deletes a resource given an Id.
     *
     * @return A response entity with the appropriate HTTP Status code
     */
    ResponseEntity delete();

}
