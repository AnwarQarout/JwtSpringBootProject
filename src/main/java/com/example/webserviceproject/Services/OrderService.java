package com.example.webserviceproject.Services;

import com.example.webserviceproject.Models.Order;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * An interface that has methods for Order related things.
 * This interface should be implemented in OrderServiceImpl
 */
@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Iterable<Order> GetAllOrdersByStatusAndDateCreatedGreaterThan();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
