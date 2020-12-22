package com.nags.stockpricing.services.interfaces;

import com.nags.stockpricing.entities.StockPrice;

import java.util.List;




public interface StockPriceServiceExcelUpload {

    List<StockPrice> process();

    boolean checkValid();

    boolean checkMissing();

    boolean checkFormat();

}
