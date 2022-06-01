package com.crudApi.entity;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "covidinfo")
    private String covidInfo;

    public Person() {
    }

    public Person(int id, String name, String surname, int age, String covidInfo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.covidInfo = covidInfo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCovidInfo(String covidInfo) {
        this.covidInfo = covidInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCovidInfo() {
        return covidInfo;
    }
}