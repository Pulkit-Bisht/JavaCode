package com.myproject.service.impl;

import com.myproject.dto.PersonDto;
import com.myproject.entities.Person;
import com.myproject.repository.PersonRepository;
import com.myproject.service.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService implements PersonInterface {
@Autowired
    PersonRepository personRepository;
@Override
    //Find All the Data of Address
    public List<PersonDto> getPerson() {

        return personRepository.
                findAll().stream().
                map(this::entityToDto).collect(Collectors.toList());
    }
    public  List<PersonDto> findName(String name){

    return personRepository.getDataByName(name).stream().map(this::entityToDto).collect(Collectors.toList());
    }
    public  List<PersonDto> findEmail(String email){

        return personRepository.getDataByEmail(email).stream().map(this::entityToDto).collect(Collectors.toList());
    }
    public  List<PersonDto> findById(Integer id){
        Optional<Person> person = personRepository.findById(id);
        Person person1 = person.get();
        PersonDto personDto = entityToDto(person1);
        List<PersonDto>personDtos=Arrays.asList(personDto);
        return personDtos;
    }
    public  List<PersonDto> pattern(String p){
        List<Person> personList = personRepository.getDataPattern(p);
        return personList.stream().map(this::entityToDto).collect(Collectors.toList());
    }
@Override
    //Insert a Data in Address
    public PersonDto pushPerson(PersonDto personDto) {
        Person person = this.dtoToEntity(personDto);
        Person save = personRepository.save(person);
        return this.entityToDto(save);

    }
@Override
    //Delete a Data in Address
    public String deletePerson(Integer id){
        personRepository.deleteById(id);
        return "Data Deleted Successfully";
    }


    private PersonDto entityToDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setFirstName(person.getPersonFirstName());
        dto.setLastName(person.getPersonLastName());
        dto.setPersonEmail(person.getPersonEmail());
        dto.setPersonPass(person.getPersonPass());

        return dto;
    }

    private Person dtoToEntity(PersonDto personDto) {
        Person person = new Person();
        person.setPersonFirstName(personDto.getFirstName());
        person.setPersonLastName(personDto.getLastName());
        person.setPersonEmail(personDto.getPersonEmail());
        person.setPersonPass(personDto.getPersonPass());
        return person;
    }
}