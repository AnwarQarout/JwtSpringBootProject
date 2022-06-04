package com.example.webserviceproject.Services;

import com.example.webserviceproject.Models.Order;
import com.example.webserviceproject.Models.Stock;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface StockService {
    Stock save(Stock product);
    @NotNull Iterable<Stock> getAllStocks();

    Stock getStock(long id);

    Stock update(Long id, Stock stockDTO);
}
