package com.crudApi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonDto {
    @Id
    private long id;
    private String name;
    private String surname;
    private int age;
    private String covidInfo;

    public long getId() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCovidInfo() {
        return covidInfo;
    }

    public void setCovidInfo(String covidInfo) {
        this.covidInfo = covidInfo;
    }

    public PersonDto(int id, String name, String surname, int age, String covidInfo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.covidInfo = covidInfo;
    }

    public PersonDto() {
    }


}
