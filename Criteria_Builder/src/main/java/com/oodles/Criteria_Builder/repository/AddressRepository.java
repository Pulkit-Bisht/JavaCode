package com.oodles.Criteria_Builder.repository;

import com.oodles.Criteria_Builder.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
