package com.example.webserviceproject.Repositories;

import com.example.webserviceproject.Models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for Stock Model
 */
@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
}
