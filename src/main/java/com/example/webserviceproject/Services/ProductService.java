package com.example.webserviceproject.Services;

import com.example.webserviceproject.Models.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * An interface that has methods for Product related things.
 * This interface should be implemented in ProductServiceImpl
 */

@Validated
public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product save(Product product);

    Product update(Long id, Product product);
}
