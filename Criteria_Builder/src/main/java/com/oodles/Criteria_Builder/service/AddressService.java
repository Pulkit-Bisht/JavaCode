package com.oodles.Criteria_Builder.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.oodles.Criteria_Builder.entities.Address;
import com.oodles.Criteria_Builder.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional
public class AddressService implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<String> getParticularStatePersonWithCityAreaPincode( String state ) {
        List<Address> allAddresses = addressRepository.findAll();

        List<String> streamedAddress =  allAddresses.stream()
                .filter( address -> address.getState().equalsIgnoreCase( state ) )
                .map( address -> address.getCity() + " -- " + address.getArea() + " -- " + address.getPincode().toString() )
                .sorted( ( address1, address2) -> address1.compareTo(address2) )
                .collect( Collectors.toList() );

        streamedAddress.forEach( System.out::println );
        return streamedAddress;


        /**
         List<String> filteredAddresses = new ArrayList<>();
         for(Address address: allAddresses) {
         if( address.getState().equalsIgnoreCase( state )) {
         filteredAddresses.add( address.getCity() + " -- " + address.getArea() + " -- " + address.getPincode().toString() );
         }
         }

         Collections.sort( filteredAddresses,  new Comparator<String>() {
         public int compare( String s1, String s2) {
         return s1.compareTo(s2);
         }
         });

         System.out.println( filteredAddresses );
         return filteredAddresses;
         */

    }

}