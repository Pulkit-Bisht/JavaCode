package com.crudApi.service;
import com.crudApi.dao.PersonDao;
import com.crudApi.dao.PersonDao;
import com.crudApi.dto.PersonDto;
import com.crudApi.entity.Person;
import com.crudApi.repositery.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao person;
    PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void addPerson(Person person) {
        person.setId(getRandomNumber(1,999999999));
        personRepository.save(person);
    }

    @Override
    public String addData(PersonDto personDto) {
        person.save(personDto);
        return "Hello";
    }

    @Override
    public List<PersonDto> getAllPerson() {
        return person.findAll();
    }
    @Override
    public void deletePersonById(long id) {

        PersonDto num1=person.getOne(id);
        person.delete(num1);
    }

    @Override
    public PersonDto getPersonById(long id) {
        return person.getOne(id);
    }
    @Override
    public String updatePerson(float id,PersonDto personDto) {
         long match= personDto.getId();
         if(match==id){
              person.save(personDto);
              return "Data Save";
         }
         return "Id not Found";

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
