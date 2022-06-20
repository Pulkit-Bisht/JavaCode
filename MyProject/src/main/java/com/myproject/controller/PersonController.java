package com.myproject.controller;

import com.myproject.dto.PersonDto;
import com.myproject.repository.PersonRepository;
import com.myproject.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/all_person")
    public List<PersonDto> findaAllPerson(){
        return this.personService.getPerson();
    }
    @PostMapping("/saveperson")
    public PersonDto savePerson(@RequestBody PersonDto personDto){
        return this.personService.pushPerson(personDto);
    }
    @DeleteMapping("/deleteperson/{id}")

    public String deletePerson(@PathVariable String id){
        return this.personService.deletePerson(Integer.parseInt(id));
    }

}
