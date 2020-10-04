package com.gauro.msscbrewery.web.controller;

import com.gauro.msscbrewery.services.CustomerService;
import com.gauro.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Chandra
 */
@Slf4j
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

    //http://localhost:8080/api/v1/customer
    @PostMapping(consumes = "application/json")
    public ResponseEntity<CustomerDto> handlePost(@RequestBody CustomerDto customerDto){
        log.info(customerDto.toString());
         CustomerDto saveDto=customerService.saveNewCustomer(customerDto);
        HttpHeaders headers=new HttpHeaders();
        headers.add("Location", "/api/v1/customer/"+saveDto.getId());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public  ResponseEntity<CustomerDto> handlePut(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto){
        log.info("Put is called"+customerDto);
        customerService.updateCustomer(customerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID cusotmerId){
        log.info("Delete {}",cusotmerId);
        customerService.deleteCustomer(cusotmerId);
    }


}
