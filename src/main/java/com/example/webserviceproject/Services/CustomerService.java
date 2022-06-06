package com.example.webserviceproject.Services;

import com.example.webserviceproject.DTO.CustomerDto;
import com.example.webserviceproject.Models.Customer;
import com.example.webserviceproject.Models.Stock;

import javax.validation.constraints.NotNull;

/**
 * An interface that has methods for Customer related things.
 * This interface should be implemented in CustomerServiceImpl
 */
public interface CustomerService {

    Customer save(Customer product);
    @NotNull Iterable<Customer> getAllStocks();

    Customer getStock(long id);




    Customer update(Long id, CustomerDto customerDto);
}
