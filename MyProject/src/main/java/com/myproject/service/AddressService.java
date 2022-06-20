package com.myproject.service;

import com.myproject.entities.Address;
import com.myproject.entities.Person;
import com.myproject.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements AddressInterface{

    @Autowired
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAddress() {
        return this.addressRepository.findAll();
    }

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Person getAddressById(Integer id) {
        return null;
    }

    @Override
    public String updateAddress(Integer id, Address address) {
        return null;
    }

    @Override
    public void deleteAddress(Integer id) {

    }
}
