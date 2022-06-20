package com.myproject.service;

import com.myproject.dto.PersonDto;

import java.util.List;


public interface PersonInterface {


    public List<PersonDto> getPerson();

    public PersonDto pushPerson(PersonDto personDto);

    public String deletePerson(Integer id);
}
