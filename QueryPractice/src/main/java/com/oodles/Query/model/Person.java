package com.oodles.Query.model;

import javax.persistence.*;

@Entity
//@Table(name = "Per")
public class Person {
    @Id
    @Column(name = "pId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

   // @Column(name = "fullName")
    private String name;

    private String city;

    @Column(name = "MobileNo.")
    private String mobno;

    private String company;

    public Person() {
    }

    public Person(int id, String name, String city, String mobno, String company) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobno = mobno;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
