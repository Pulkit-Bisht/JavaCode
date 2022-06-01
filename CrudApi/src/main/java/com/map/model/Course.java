package com.map.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Course_Details")
public class Course {
    @Id
    @Column(name = "C_Id")
    private Integer id;
    private String course;
    @ManyToOne
    private Person personList;

    public Course(Integer id, String course, Person personList) {
        this.id = id;
        this.course = course;
        this.personList = personList;
    }

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Person getPersonList() {
        return personList;
    }

    public void setPersonList(Person personList) {
        this.personList = personList;
    }

    @Entity
    @Table(name = "Project_Details")
    public static class Projects {
        @Id
        @Column(name = "project_id")
        private Integer id;
        @Column(name = "project_name")
        private String name;

        @ManyToMany
        private List<Address.Employee> employees;

        public Projects(Integer id, String name, List<Address.Employee> employees) {
            this.id = id;
            this.name = name;
            this.employees = employees;
        }

        public Projects() {
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

        public List<Address.Employee> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Address.Employee> employees) {
            this.employees = employees;
        }
    }
}
