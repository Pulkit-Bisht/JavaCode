package com.crudApi.controller;
import com.crudApi.dto.PersonDto;
import com.crudApi.entity.Person;
import com.crudApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/save")
    public String savePerson(@RequestBody PersonDto personDto) {
    return this.personService.addData(personDto);
    }

    @GetMapping("/get")
    public List<PersonDto> getData(){
        return this.personService.getAllPerson();
    }


   @DeleteMapping("/del/{n}")
    public void del(@PathVariable String n){
this.personService.deletePersonById(Long.parseLong(n));
   }
@PatchMapping("/update/{id}")
    public void update(@PathVariable String id,@RequestBody PersonDto personDto){
        this.personService.updatePerson(Long.parseLong(id),personDto);

}

}