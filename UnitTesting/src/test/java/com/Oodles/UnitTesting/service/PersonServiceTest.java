package com.Oodles.UnitTesting.service;

import com.Oodles.UnitTesting.repo.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

class PersonServiceTest {
    @ExtendWith(MockitoExtension.class)
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setup(){
        this.personService=new PersonService(this.personRepository);
    }
    @Test
    void getAllPerson() {
        personService.getAllPerson();
         verify(personRepository).findAll();
    }


}