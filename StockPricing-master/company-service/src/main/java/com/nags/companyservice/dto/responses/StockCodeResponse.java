package com.nags.companyservice.dto.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prabhu.companyservice.entities.Company;
import com.prabhu.companyservice.entities.Ipo;
import com.prabhu.companyservice.entities.StockExchange;
import lombok.Data;

import javax.persistence.*;




public class StockCodeResponse {


    private int id;

    private String code;

    private StockExchange stockExchange;

    private Company company;
}
