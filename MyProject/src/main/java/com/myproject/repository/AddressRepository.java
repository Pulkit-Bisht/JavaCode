package com.myproject.repository;

import com.myproject.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
