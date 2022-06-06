package com.User.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int user_Id;
    private String name;
    private String phone;
    private List<Contact>contact=new ArrayList<>();

    public User() {
    }

    public User(int user_Id, String name, String phone, List<Contact> contact) {
        this.user_Id = user_Id;
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }

    public User(int user_Id, String name, String phone) {
        this.user_Id = user_Id;
        this.name = name;
        this.phone = phone;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
