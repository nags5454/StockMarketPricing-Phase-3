package com.nags.stockpricing.repos;

import com.nags.stockpricing.entities.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface StockPriceRepo extends JpaRepository<StockPrice, Long> {

    List<StockPrice> findAllByStockCodeId(int stockCodeId);

    Optional<StockPrice> findStockPriceByStockCodeIdAndDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndDateAfterOrderByDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndDateBetweenOrderByDate(int stockCodeId, Date startDate, Date endDate);

    List<StockPrice> findAllByStockCodeIdAndDateBeforeOrderByDate(int stockCodeId, Date date);

    List<StockPrice> findAllByStockCodeIdAndPriceLessThanEqualOrderByPriceDesc(int stockCodeId,
                                                                                   long maxPrice);

    List<StockPrice> findAllByStockCodeIdAndPriceGreaterThanEqualOrderByPriceAsc(int stockCodeId,
                                                                                         long minPrice);

}
