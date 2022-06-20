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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer addressId;
    @Column(name = "country_name")
    private String country;
    @Column(name = "state_name")
    private String state;
    @Column(name = "district_name")
    private String district;
    @Column(name = "city_name")
    private String city;
    @Column(name = "pin_code")
    private Integer pinCode;
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;
}
