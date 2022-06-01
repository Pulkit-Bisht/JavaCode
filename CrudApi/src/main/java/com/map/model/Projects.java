package com.map.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Projects {
    @Id
    @Column(name = "project_id")
    private Integer id;
    @Column(name = "project_name")
    private String name;
@ManyToMany
@JoinColumn
    private List<Employee>employeeList;

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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Projects(Integer id, String name, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
    }

    public Projects() {
    }
}
