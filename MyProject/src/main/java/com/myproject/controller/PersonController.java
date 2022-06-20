package com.myproject.controller;

import com.myproject.dto.PersonDto;
import com.myproject.entities.Person;
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
    @GetMapping("/findByName/{name}")
    public List<PersonDto> myname(@PathVariable String name){
        return personService.findName(name);
    }
    @GetMapping("/findByEmail/{email}")
    public List<PersonDto> myEmail(@PathVariable String email){
        return personService.findEmail(email);
    }
    @GetMapping("/findById/{id}")
    public List<PersonDto> myId(@PathVariable Integer id){
        return personService.findById(id);
    }
    @GetMapping("/findByPattern/{p}")
    public List<PersonDto> Pat(@PathVariable String p){
        return personService.pattern(p);
    }
}
