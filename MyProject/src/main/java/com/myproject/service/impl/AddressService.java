package com.myproject.service.impl;

import com.myproject.dto.AddressDto;
import com.myproject.entities.Address;
import com.myproject.entities.Person;
import com.myproject.repository.AddressRepository;
import com.myproject.repository.PersonRepository;
import com.myproject.service.AddressInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService implements AddressInterface {
    @Autowired
    private AddressRepository addressRepository;
@Autowired
    private PersonRepository personRepository;

@Override
//Find All the Data of Address
    public List<AddressDto> getAddress() {

        return addressRepository.
                findAll().stream().
                map(this::entityToDto).collect(Collectors.toList());
    }

@Override
    //Insert a Data in Address
    public AddressDto pushAddress(AddressDto addressDto,Integer id) {
        Optional <Person> person=personRepository.findById(id);
        if(!person.isPresent()){
            throw new BadCredentialsException("No Id Found");
        }
        Address address = dtoToEntity(addressDto);
        address.setPerson(person.get());
      addressRepository.save(address);
      return addressDto;

    }
@Override
    //Delete a Data in Address
public String deleteAddress(Integer id){
        addressRepository.deleteById(id);
        return "Data Deleted Successfully";
}

    private AddressDto entityToDto(Address address) {
        AddressDto dto = new AddressDto();
        dto.setCity(address.getCity());
        dto.setCountry(address.getCountry());
        dto.setDistrict(address.getDistrict());
        dto.setState(address.getState());
        dto.setPinCode(address.getPinCode());
        return dto;
    }

    private Address dtoToEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        address.setDistrict(addressDto.getDistrict());
        address.setState(addressDto.getState());
        address.setPinCode(addressDto.getPinCode());
        return address;
    }
}
