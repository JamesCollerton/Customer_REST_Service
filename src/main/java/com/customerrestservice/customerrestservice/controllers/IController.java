package com.customerrestservice.customerrestservice.controllers;

import org.springframework.http.ResponseEntity;

/**
 * This is an interface surrounding the functionality of controllers. It purposefully does not include any Spring
 * functionality as it should be agnostic of the framework implementation.
 *
 * @param <ResponseObject> The object we intend to return when we call the GET or POST methods
 */
public interface IController<ResponseObject> {

    /**
     * Called when we use GET on the controller. Retrieves a resource.
     *
     * @param id Id of the resource we are retrieving
     * @return A response entity with the appropriate HTTP Status code and object
     */
    ResponseEntity<ResponseObject> get(String id);

    /**
     * Called when we use POST on the controller. Creates a resource.
     *
     * @param responseObject Object we would like to create
     * @return A response entity with the appropriate HTTP Status code and object
     */
    ResponseEntity<ResponseObject> post(ResponseObject responseObject);

    /**
     * Called when we use PUT on the controller. Updates a resource given an Id.
     *
     * @param id Id of the resource we are updating
     * @param responseObject Object we would like to update to
     * @return A response entity with the appropriate HTTP Status code
     */
    ResponseEntity put(String id, ResponseObject responseObject);

    /**
     * Called when we use DELETE on the controller. Deletes a resource given an Id.
     *
     * @param id Id of the resource we are deleting
     * @return A response entity with the appropriate HTTP Status code
     */
    ResponseEntity delete(String id);

}
