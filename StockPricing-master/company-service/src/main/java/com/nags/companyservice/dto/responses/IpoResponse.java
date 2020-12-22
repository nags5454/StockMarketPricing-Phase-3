package com.nags.companyservice.dto.responses;

import com.nags.companyservice.entities.Company;
import com.nags.companyservice.entities.StockCode;
import com.nags.companyservice.entities.StockExchange;

import javax.persistence.*;
import java.util.Date;


public class IpoResponse {

    private int id;

    private StockCodeResponse stockCode;

    private Company company;

    private StockExchange stockExchange;

    private long numberOfShares;

    private Date openDate;
}
