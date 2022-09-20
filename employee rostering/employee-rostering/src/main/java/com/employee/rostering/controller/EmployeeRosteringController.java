package com.employee.rostering.controller;

import com.employee.rostering.domain.Employee;
import com.employee.rostering.domain.Shift;
import com.employee.rostering.domain.Skill;
import com.employee.rostering.solution.SolutionEmployee;
import lombok.extern.slf4j.Slf4j;
import org.optaplanner.core.api.solver.SolverFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@RestController
@RequestMapping("/myProject")
public class EmployeeRosteringController {

@GetMapping
    private String test(){
    List<Skill> skills = new ArrayList<>();
    skills.add(new Skill(1L, "first"));
    skills.add(new Skill(2L, "second"));
    skills.add(new Skill(3L, "third"));

    List<Skill> skills1 = new ArrayList<>();
    skills1.add(new Skill(4L, "fourth"));
    skills1.add(new Skill(5L, "fifth"));
    skills1.add(new Skill(6L, "six"));

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1L, "Pushkar", skills));
    employees.add(new Employee(2L, "Pooja", skills1));
    employees.add(new Employee(3L, "Poonam", Stream.concat(skills.stream(), skills1.stream())
            .collect(Collectors.toList())));
    employees.add(new Employee(3L, "Riya", Stream.concat(skills.stream(), skills1.stream())
            .collect(Collectors.toList())));



    List<Shift> shifts = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
    shifts.add(new Shift(1L, LocalDateTime.now(), LocalDateTime.now().plusHours(1), skills, null));

    shifts.add(new Shift(2L, LocalDateTime.now().plusHours(2),
            LocalDateTime.now().plusHours(3), skills1, null));

    shifts.add(new Shift(3L, LocalDateTime.now().plusHours(4),
            LocalDateTime.now().plusHours(5),
            Stream.concat(skills.stream(), skills1.stream())
                    .collect(Collectors.toList()), null));

    SolutionEmployee solutionEmployee = new SolutionEmployee();
   solutionEmployee.setEmployees(employees);
   solutionEmployee.setShifts(shifts);

    SolverFactory<SolutionEmployee>solverFactory = SolverFactory.createFromXmlResource("optaplanner/SolverConfig.xml");
    org.optaplanner.core.api.solver.Solver<SolutionEmployee> solver = solverFactory.buildSolver();

    SolutionEmployee solutionEmployee1 = solver.solve(solutionEmployee);

    log.info(solutionEmployee1.getScore().toString());
    return "employee rostering testing successfully ";
}
}
