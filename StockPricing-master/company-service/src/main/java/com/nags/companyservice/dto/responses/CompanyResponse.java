package com.nags.companyservice.dto.responses;

import com.nags.companyservice.entities.Address;
import com.nags.companyservice.entities.CompanyDetails;
import com.nags.companyservice.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyResponse {

    private int id;

    private String name;

    private long turnover;

    private Person ceo;

    private List<Person> bod;

    
    private List<StockExchangeResponse> listedIn;
    
    private List<StockCodeRespose> stockCodes;

    private SectorResponse sector;

    private List<IpoResponse> ipos;

    private Address address;

    private CompanyDetails furtherDetails;
}
