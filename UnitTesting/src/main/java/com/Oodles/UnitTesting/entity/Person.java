package com.Oodles.UnitTesting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id

    private Integer personalId;

    private String personName;

    private String personCity;

    public Person(Integer personalId, String personName, String personCity) {
        this.personalId = personalId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public Person() {

    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCity(){
        return personCity;
    }
    public void setPersonCity(String personCity){
        this.personCity=personCity;
    }
}
