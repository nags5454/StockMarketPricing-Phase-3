package com.nags.companyservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity(name = "stockcodes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockCode {

    @Column(name = "stockcode_id")
    @Id
    @GeneratedValue
    @JsonIgnore()
    private int id;

    @Column(name = "code", nullable = false)
    private String code;

    @JoinColumn(name = "stock_exchange_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private StockExchange stockExchange;

    @JoinColumn(nullable = false, name = "comapny_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
}
