package com.map.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @Column(name = "emp_id")
    private Integer id;

    @Column(name = "emp_name")
    private String name;
@ManyToMany
@JoinColumn
    private List<Projects>projectsList;

    public Employee() {
    }

    public Employee(Integer id, String name, List<Projects> projectsList) {
        this.id = id;
        this.name = name;
        this.projectsList = projectsList;
    }

    public Integer getId() {
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

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}
