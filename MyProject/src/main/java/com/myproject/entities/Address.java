package com.myproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @Column(name = "Id")
    private Integer address_Id;
    @Column(name = "country_name")
    private String country;
    @Column(name = "state_name")
    private String state;
    @Column(name = "district_name")
    private String district;
    @Column(name = "city_name")
    private String city;
    @Column(name = "pin_code")
    private Integer pin_code;

}
