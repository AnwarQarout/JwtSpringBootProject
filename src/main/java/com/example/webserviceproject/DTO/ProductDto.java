package com.example.webserviceproject.DTO;

import javax.validation.constraints.NotNull;

/***
 * DTO class for Product
 * This is  the best practice and makes it more secure to access and add to the repo
 */
public class ProductDto {

    private Long ID;
    private String slug;
    private String name;
    private String reference;
    private double price;
    private double vat;
    private boolean stockable;

    public ProductDto(Long ID, String slug, @NotNull(message = "Product name is required.") String name, String reference, double price, double vat, boolean stockable) {
        this.ID = ID;
        this.slug = slug;
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.vat = vat;
        this.stockable = stockable;
    }





    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public boolean isStockable() {
        return stockable;
    }

    public void setStockable(boolean stockable) {
        this.stockable = stockable;
    }


}
