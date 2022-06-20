package com.myproject.converter;

import com.myproject.dto.AddressDto;
import com.myproject.entities.Address;

public class AddressConverter {
    public AddressDto entityToDto(Address address){
    AddressDto dto=new AddressDto();
    dto.setCity(address.getCity());
    dto.setCountry(address.getCountry());
    dto.setDistrict(address.getDistrict());
    dto.setState(address.getState());
    dto.setPinCode(address.getPinCode());
    return dto;
    }
}
