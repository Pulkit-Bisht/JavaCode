package com.example.swagger;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class AddressBookResource {

    ConcurrentHashMap<String,Contact> contacts=new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "value can be get from id",notes = "hum id se data nikal skte h",response = Contact.class)
    public Contact getContact(@ApiParam(value = "id milegi ek bnde ki",required = true) @PathVariable String id){
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContact(){
        return new ArrayList<Contact>(contacts.values());
    }
    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
    contacts.put(contact.getId(),contact);
    return contact;
    }
}
