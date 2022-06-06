package com.Contact.service;

import com.Contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact>contactList= Arrays.asList(
            new Contact(1,"pushkar7216@gmail.com","Pushkar",1201),
            new Contact(2,"ghildiyalvandna@gmail.com","Vandna",1202),
            new Contact(3,"naman345@gmail.com","Naman",1203),
            new Contact(4,"ravi0098@gmail.com","Ravi",1204),
            new Contact(5,"meenu1245@gmail.com","Meenu",1205)
    );


    @Override
    public List<Contact> getContactById(int id) {
        return contactList.stream().filter(contact -> contact.getUser_Id()==id).collect(Collectors.toList());
    }

    @Override
    public List<Contact> getContact() {
        return contactList;
    }
}
