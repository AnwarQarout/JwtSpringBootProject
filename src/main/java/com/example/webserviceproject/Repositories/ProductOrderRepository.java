package com.example.webserviceproject.Repositories;

import com.example.webserviceproject.Models.ProductOrder;
import com.example.webserviceproject.Models.ProductOrderPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, ProductOrderPK> {
}
