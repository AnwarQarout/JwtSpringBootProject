package com.example.webserviceproject.Controller;

import com.example.webserviceproject.Models.Order;
import com.example.webserviceproject.ServicesImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductOrderController {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    /*Create an order */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.ALL_VALUE,path = "/orders/create")
   // @PostMapping("/orders/create")
    public Order createOrder(@RequestBody Order order) {
        return orderServiceImpl.create(order);
    }
}
