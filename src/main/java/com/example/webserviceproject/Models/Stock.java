package com.example.webserviceproject.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * A simple model for Stocks
 */
@Data
@Table
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "product")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "ID")
    private Product product;

    private int quantity;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate updateAt;

}
