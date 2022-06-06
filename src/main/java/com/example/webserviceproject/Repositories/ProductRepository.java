package com.example.webserviceproject.Repositories;

import com.example.webserviceproject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository class for Product Model
 */

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
