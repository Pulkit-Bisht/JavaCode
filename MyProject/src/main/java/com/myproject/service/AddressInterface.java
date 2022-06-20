package com.myproject.service;

import com.myproject.dto.AddressDto;

import java.util.List;

public interface AddressInterface {


    public AddressDto pushAddress(AddressDto addressDto,Integer id);

    public String deleteAddress(Integer id);

    public List<AddressDto> getAddress();

}
