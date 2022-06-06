package com.example.webserviceproject.Controller;

import com.example.webserviceproject.Models.Product;
import com.example.webserviceproject.ServicesImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    /*  Return all products in the system */
    @GetMapping("/products/findAll")
    public Iterable<Product> getAllProducts() {
        return productServiceImpl.getAllProducts();
    }

}
