package com.Contact.service;

import com.Contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactById(int id);
    public List<Contact>getContact();
}
