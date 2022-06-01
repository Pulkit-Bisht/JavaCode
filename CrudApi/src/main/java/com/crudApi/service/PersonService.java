package com.crudApi.service;
import com.crudApi.dao.PersonDao;
import com.crudApi.dto.PersonDto;
import  com.crudApi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);
    String addData(PersonDto personDto);
    List<PersonDto> getAllPerson();
    PersonDto getPersonById(long id);
    String updatePerson(float id,PersonDto personDto);
    void deletePersonById(long id);


}
