package com.nags.stockpricing.services.impl;

import com.nags.stockpricing.entities.StockPrice;
import com.nags.stockpricing.repos.StockPriceRepo;
import com.nags.stockpricing.services.interfaces.StockPriceServiceExcelUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StockPriceServiceExcelUploadImpl implements StockPriceServiceExcelUpload {

    private final StockPriceRepo repo;

    @Autowired
    public StockPriceServiceExcelUploadImpl(StockPriceRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<StockPrice> process() {
        return null;
    }

    @Override
    public boolean checkValid() {
        return false;
    }

    @Override
    public boolean checkMissing() {
        return false;
    }

    @Override
    public boolean checkFormat() {
        return false;
    }
}
