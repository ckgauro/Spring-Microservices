package com.gauro.msscbrewery.services;

import com.gauro.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Chandra
 */
@Service
public class CustomerServiceImpl implements  CustomerService{
    @Override
    public CustomerDto getCustomerId(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Chandra")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId) {

    }

    @Override
    public void deleteCustomer(UUID cusotmerId) {

    }
}
