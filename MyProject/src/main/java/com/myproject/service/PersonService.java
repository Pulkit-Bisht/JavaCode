package com.myproject.service;

import com.myproject.entities.Person;
import com.myproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonInterface {

    @Autowired
    PersonRepository personRepository;
@Autowired
Person person;
    public PersonService() {
        super();
    }

    @Override
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Integer id) {
        return null;
    }

    @Override
    public String updatePerson(Integer id, Person person) {
        Integer personId = person.getPerson_id();
        if (personId==id){
            personRepository.save(person);
            return "Data Updated";
        }
        else {
            return "Id not Found";
        }
    }

    @Override
    public void deletePerson(Integer id) {
        Person person1 = personRepository.getOne(id);
        personRepository.delete(person1);
    }
}
