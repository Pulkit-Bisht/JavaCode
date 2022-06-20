package com.myproject.service;

import com.myproject.entities.Person;

import java.util.List;


public interface PersonInterface {


    public void addPerson(Person person);
    public List<Person>getPerson();
    public Person getPersonById(Integer id);
    public String updatePerson(Integer id,Person person);
    public void deletePerson(Integer id);
}
