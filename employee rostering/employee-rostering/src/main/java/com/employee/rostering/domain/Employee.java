package com.employee.rostering.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
//i dont know about

//Problem h employee ko kise shift assign kre

public class Employee {

    private Long id;
    private String name;
    private List<Skill>skills;
}
