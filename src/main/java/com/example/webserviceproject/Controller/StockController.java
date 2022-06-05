package com.example.webserviceproject.Controller;

import com.example.webserviceproject.Models.Stock;
import com.example.webserviceproject.ServicesImpl.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    StockServiceImpl stockServiceImpl;

    @GetMapping("/stocks")
    public Iterable<Stock> getStock() {
        return stockServiceImpl.getAllStocks();
    }

}
