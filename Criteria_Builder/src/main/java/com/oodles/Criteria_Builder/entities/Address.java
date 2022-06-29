package com.oodles.Criteria_Builder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.oodles.Criteria_Builder.util.AddressType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column
    private String area;

    @Column
    private Integer pincode;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    @Column
    private AddressType addressType;

}