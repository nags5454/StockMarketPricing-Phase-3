package com.nags.companyservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;




@Entity(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @JsonIgnore()
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    @Column(name = "person_name")
    private String name;

    @JsonIgnore()
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company memberOf;

    public Person(String name){
        this.name = name;
    }
}
