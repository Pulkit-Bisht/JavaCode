package com.Oodles.UnitTesting.controller;

import com.Oodles.UnitTesting.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPerson(){
        return ResponseEntity.ok(this.personService.getAllPerson());
    }
}
