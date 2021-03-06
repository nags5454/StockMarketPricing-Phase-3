package com.nags.stockpricing.services.interfaces;

import com.nags.stockpricing.entities.StockPrice;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface StockPriceServiceBasic {
    List<StockPrice> findAllByStockCodeId(int stockCodeId);

    Optional<StockPrice> findStockPriceByStockCodeIdAndDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndDateAfterOrderByDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndDateBetweenOrderByDate(int stockCodeId, Date startDate, Date endDate);

    List<StockPrice> findAllByStockCodeIdAndDateBeforeOrderByDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndPriceLessThanEqualOrderByPriceDesc(int stockCodeId,
                                                                               long maxPrice);

    List<StockPrice> findAllByStockCodeIdAndPriceGreaterThanEqualOrderByPriceAsc(int stockCodeId,
                                                                                 long minPrice);
    Optional<StockPrice> findStockPriceById(long id);

    void save(Iterable<StockPrice> stockPrices);

    void save(StockPrice stockPrice);
}
