package com.example.webserviceproject.ServicesImpl;

import com.example.webserviceproject.Models.ProductOrder;
import com.example.webserviceproject.Repositories.ProductOrderRepository;

import com.example.webserviceproject.Services.ProductOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductOrderServiceImpl implements ProductOrderService {

    private ProductOrderRepository productOrderRepository;

    public ProductOrderServiceImpl(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }

    @Override
    public ProductOrder create(ProductOrder orderProduct) {
        return this.productOrderRepository.save(orderProduct);
    }
}
