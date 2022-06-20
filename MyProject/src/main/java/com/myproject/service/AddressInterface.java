package com.myproject.service;

import com.myproject.entities.Address;
import com.myproject.entities.Person;

import java.util.List;

public interface AddressInterface {

    public void saveAddress(Address address);
    public List<Address>getAddress();
    public Person getAddressById(Integer id);
    public String updateAddress(Integer id,Address address);
    public void deleteAddress(Integer id);
}
