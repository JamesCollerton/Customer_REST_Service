[![Build Status](https://travis-ci.com/JamesCollerton/Customer_REST_Service.svg?branch=master)](https://travis-ci.com/JamesCollerton/Customer_REST_Service)
[![codecov](https://codecov.io/gh/JamesCollerton/Customer_REST_Service/branch/master/graph/badge.svg)](https://codecov.io/gh/JamesCollerton/Customer_REST_Service)
[![Maintainability](https://api.codeclimate.com/v1/badges/8852f509c33c43605ca9/maintainability)](https://codeclimate.com/github/JamesCollerton/Customer_REST_Service/maintainability)

# Customer Service REST API

This is a small example REST API service written in Spring Boot in order to gain experience of creating a very basic REST set up.

## Build and Code Coverage Tools

A Travis CI build has been set up in order to allow for continuous building and testing of the application. In terms of code coverage tools Code Cov has been added to host code coverage reports. Additionally Code Climate is being used to allow for monitoring of properties like maintanability.

## End Points and Swagger

The end points of the application are as follows. All of these were derived using the rules in the REST API design rulebook written by O'Reilly.

### End points

#### Get customer

```
GET customers/{id}
```

#### Delete customer

```
DELETE customers/{id}
```

#### Update customer

For the sake of this simple example we are assuming that we only want to update when we have an Id and effectively want to overwrite what is in the database for that data object.

```
PUT customers/{id}
```

#### Create customer 

```
POST customers
```

### Swagger

Swagger has also been used to generate some documentation for the API. The documentation can be found at [here]().

## Database

This simple example uses an embedded H2 database to read and write to.
