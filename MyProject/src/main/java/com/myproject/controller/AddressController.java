package com.myproject.controller;

import com.myproject.entities.Address;
import com.myproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
@Autowired
    private AddressService addressService;

    @GetMapping("/all_address")
    public List<Address> allAddress(){
        return this.addressService.getAddress();
    }

    @PostMapping("/save_address")
    public void saveAddress(Address address){
        this.addressService.saveAddress(address);
    }
}
