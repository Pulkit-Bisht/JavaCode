package com.myproject.controller;

import com.myproject.entities.Person;
import com.myproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
@Autowired
PersonService personService;
    @PostMapping("/save")
    public void savePersonDetail(@RequestBody Person person){
        this.personService.addPerson(person);
    }
    @GetMapping("/getperson")
    public ResponseEntity<?>personData(){
        List<Person> list = this.personService.getPerson();
        return ResponseEntity.ok(list);
    }
    @DeleteMapping("/delete:{id}")
    public void delete(@PathVariable  String id){
        this.personService.deletePerson(Integer.parseInt(id));
    }

    @PatchMapping("/update:{id}")
    public void update(@PathVariable String id,@RequestBody Person person){
        this.personService.updatePerson(Integer.parseInt(id),person);
    }
}
