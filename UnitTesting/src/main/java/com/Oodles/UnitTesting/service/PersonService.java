package com.Oodles.UnitTesting.service;

import com.Oodles.UnitTesting.entity.Person;
import com.Oodles.UnitTesting.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return this.personRepository.findAll();
    }
    public PersonService(PersonRepository repository){
        this.personRepository=repository;
    }

}
