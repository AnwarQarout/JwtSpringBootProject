package com.example.webserviceproject.DTO;

import com.example.webserviceproject.Models.Product;

/***
 * DTO class for Product2Order
 * This is  the best practice and makes it more secure to access and add to the repo
 */
public class ProductOrderDto {

    private Product product;
    private Integer quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
