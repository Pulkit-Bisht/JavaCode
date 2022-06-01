package com.map.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @Column(name = "address_id")

    private Integer id;
    private String city;
    private String village;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", village='" + village + '\'' +
                '}';
    }

    public Address(Integer id, String city, String village) {
        this.id = id;
        this.city = city;
        this.village = village;
    }

    public Address() {
    }

    @Entity
    @Table(name = "Employee_Details")
    public static class Employee {
        @Id
        @Column(name = "emp_id")
        private  Integer id;
        @Column(name = "emp_name")
        private String name;

        @ManyToMany
        private List<Course.Projects> projects;

        public Employee() {
        }

        public Employee(Integer id, String name, List<Course.Projects> projects) {
            this.id = id;
            this.name = name;
            this.projects = projects;
        }

        public int getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Course.Projects> getProjects() {
            return projects;
        }

        public void setProjects(List<Course.Projects> projects) {
            this.projects = projects;
        }
    }
}
