package com.example.webserviceproject.Services;

import com.example.webserviceproject.DTO.ProductOrderDto;
import com.example.webserviceproject.Models.ProductOrder;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * An interface that has methods for ProductOrder related things.
 * This interface should be implemented in ProductOrderServiceImpl
 */

@Validated
public interface ProductOrderService {

    ProductOrder create(@NotNull(message = "The products for order cannot be null.") @Valid ProductOrder orderProduct);

}
