package com.Contact.entity;

public class Contact {
    private int cId;
    private String email;
    private String contactName;
    private int User_Id;

    public Contact() {
    }

    public Contact(int cId, String email, String contactName, int user_Id) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        User_Id = user_Id;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }
}
