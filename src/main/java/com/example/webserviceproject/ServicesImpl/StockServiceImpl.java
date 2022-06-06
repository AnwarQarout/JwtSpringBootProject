package com.example.webserviceproject.ServicesImpl;

import com.example.webserviceproject.Models.Stock;
import com.example.webserviceproject.Repositories.StockRepository;
import com.example.webserviceproject.Services.StockService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * This is the Service class for Stocks which implements the StockService interface and overrides the methods there.
 */


@Service
@Transactional
public class StockServiceImpl implements StockService {

    private StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Iterable<Stock> getAllStocks() {
        return stockRepository.findAll();
    }



    @Override
    public Stock getStock(long id) {
        return stockRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Long id, Stock stockDTO) {
        Optional<Stock> stock = stockRepository.findById(id);

        stock.get().setQuantity(stockDTO.getQuantity());
        stock.get().setUpdateAt(stockDTO.getUpdateAt());
        stock.get().setProduct(stockDTO.getProduct());


        Stock result = stockRepository.save(stock.get());
        //todo you should use mappers to spperate the DTO and entities usage.
        return result;
    }
}