package com.example.webserviceproject.Services;

import com.example.webserviceproject.Models.Order;
import com.example.webserviceproject.Models.Stock;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * An interface that has methods for Stock related things.
 * This interface should be implemented in StockServiceImpl
 */

public interface StockService {
    Stock save(Stock product);
    @NotNull Iterable<Stock> getAllStocks();

    Stock getStock(long id);

    Stock update(Long id, Stock stockDTO);
}
