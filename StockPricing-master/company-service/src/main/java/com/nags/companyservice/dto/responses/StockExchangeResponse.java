package com.nags.companyservice.dto.responses;

import com.nags.companyservice.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockExchangeResponse {

    private int id;

    private String name;

    private String biref;

    private Address address;

    private String remarks;
}
