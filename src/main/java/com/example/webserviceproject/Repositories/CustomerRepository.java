package com.example.webserviceproject.Repositories;

import com.example.webserviceproject.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Optional<Customer>findByEmail();
    Boolean existsByEmail(String email );

    boolean existsByEmailAndPassword(String email, String password);
}
