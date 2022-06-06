package com.example.webserviceproject.ServicesImpl;

import com.example.webserviceproject.Models.Product;
import com.example.webserviceproject.Repositories.ProductRepository;
import com.example.webserviceproject.Services.ProductService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * This is the Service class for Products which implements the ProductService interface and overrides the methods there.
 */

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product productDTO) {
        Optional<Product> product = productRepository.findById(id);

        product.get().setPrice(productDTO.getPrice());
        product.get().setName(productDTO.getName());
        product.get().setReference(productDTO.getReference());
        product.get().setSlug(productDTO.getSlug());
        product.get().setStockable(productDTO.isStockable());
        product.get().setStockList(productDTO.getStockList());
        product.get().setVat(productDTO.getVat());

        Product result = productRepository.save(product.get());
        //todo you should use mappers to spperate the DTO and entities usage.
        return result;
    }
}
