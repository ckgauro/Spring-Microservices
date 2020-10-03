package com.gauro.msscbrewery.web.controller;

import com.gauro.msscbrewery.services.CustomerService;
import com.gauro.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Chandra
 */

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    //https://www.uuidgenerator.net/
    //http://localhost:8080/api/v1/customer/d11b4d65-23f9-4e49-85a3-558efc2db44f
    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerId(customerId), HttpStatus.OK);
    }
}
