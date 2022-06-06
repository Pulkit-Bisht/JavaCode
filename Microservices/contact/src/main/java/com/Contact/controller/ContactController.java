package com.Contact.controller;

import com.Contact.entity.Contact;
import com.Contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping("contact/{id}")
    public List<Contact>getOneContact(@PathVariable("id") int id){
        return this.contactService.getContactById(id);
    }
    @GetMapping("contacts")
    public List<Contact>getContact(){
        return contactService.getContact();
    }
}
