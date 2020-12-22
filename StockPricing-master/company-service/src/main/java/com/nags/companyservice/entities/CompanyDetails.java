package com.nags.companyservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;



@NoArgsConstructor
@Data
@AllArgsConstructor
@Embeddable
public class CompanyDetails {

    private String description;

    private String services;

    private String products;

}
