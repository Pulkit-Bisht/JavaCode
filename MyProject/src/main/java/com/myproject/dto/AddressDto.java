package com.myproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private String country;
    private String state;
    private String district;
    private String city;
    private Integer pinCode;
}
