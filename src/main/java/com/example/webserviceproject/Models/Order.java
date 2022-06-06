package com.example.webserviceproject.Models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
/**
 * A model entity for Orders
 */
@Entity
@Table(name = "orders")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "stock")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "ID")
    private Customer customer;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate updateAt;


    public void setDateCreated(LocalDate dateCreated) {
        this.updateAt = dateCreated;
    }
}
