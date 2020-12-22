package com.nags.stockpricing.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StockPrice {

    @Id
    @GeneratedValue
    private long id;

    private int stockCodeId;

    private long price;

    private Date date;

}
