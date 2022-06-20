package com.myproject.controller;

import com.myproject.dto.AddressDto;
import com.myproject.service.impl.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService service;

    @GetMapping("/all_address")
    public List<AddressDto> findAllAddress(){
      return service.getAddress();
    }
    @PostMapping("/save/{id}")
    public AddressDto saveAddress(@RequestBody AddressDto addressDto,@PathVariable Integer id){

       return service.pushAddress(addressDto,id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable String id){
        return this.service.deleteAddress(Integer.parseInt(id));
    }

}
