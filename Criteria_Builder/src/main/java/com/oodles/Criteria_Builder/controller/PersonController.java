package com.oodles.Criteria_Builder.controller;

import java.util.List;

import com.oodles.Criteria_Builder.entities.Person;
import com.oodles.Criteria_Builder.model.request.PersonRequestModel;
import com.oodles.Criteria_Builder.model.request.PersonSearchRequestModel;
import com.oodles.Criteria_Builder.model.response.PersonResponseModel;
import com.oodles.Criteria_Builder.service.IPersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.ApiOperation;

@RestController
public class PersonController {

    private static final String ENDPOINT = "/person";

    @Autowired
    private IPersonService personService;

    @ApiOperation(value="ADD PERSON")
    @PostMapping( value=ENDPOINT,
            consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponseModel> addPerson(@RequestBody PersonRequestModel personRequestModel ) {
        ModelMapper modelMapper = new ModelMapper();
        PersonResponseModel personResponseModel = modelMapper.map( personService.addPerson(personRequestModel), PersonResponseModel.class);
        return new ResponseEntity<PersonResponseModel>( personResponseModel, HttpStatus.CREATED);
    }

    @ApiOperation(value="SEARCH PERSONs")
    @PostMapping( value=ENDPOINT + "/search",
            consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> searchPersons(@RequestBody PersonSearchRequestModel personSearchRequestModel ) {
        List<Person> persons = personService.searchPerson(personSearchRequestModel);
        return new ResponseEntity<List<Person>>( persons , HttpStatus.OK);
    }
    @GetMapping(value = ENDPOINT + "/welcome")
    public String welcome(){
        return "Welcome to my Page";
    }
}
