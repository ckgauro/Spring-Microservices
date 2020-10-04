package com.gauro.msscbrewery.services;

import com.gauro.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Chandra
 */
public interface CustomerService {
    CustomerDto getCustomerId(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId);

    void deleteCustomer(UUID cusotmerId);
}
