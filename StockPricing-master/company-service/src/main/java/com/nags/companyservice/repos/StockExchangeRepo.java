package com.nags.companyservice.repos;

import com.nags.companyservice.entities.StockExchange;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer> {

    StockExchange findStockExchangeByName(String name);

    StockExchange findStockExchangesByNameContaining(String partName);
}
