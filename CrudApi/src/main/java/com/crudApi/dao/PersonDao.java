package com.crudApi.dao;

import com.crudApi.dto.PersonDto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonDao extends JpaRepository<PersonDto,Long> {
}
