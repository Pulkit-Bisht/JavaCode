package com.employee.rostering.solution;

import com.employee.rostering.domain.Employee;
import com.employee.rostering.domain.Shift;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScore;

import java.util.List;

@PlanningSolution
public class SolutionEmployee {

    //In solution class m jo pannning entity hoti h use as a collection roop m rkha jta h
    @PlanningEntityCollectionProperty
    private List<Shift> shifts;

    //yha pr hume employee ko kis shift m rkha h ye problem h esliye ye
    // problem facrory collection property h
    @ProblemFactCollectionProperty
    @ValueRangeProvider(id="employeeRange")
    private List<Employee> employees;

    //ye score use hota  h solution nikalne m
    @PlanningScore
    private HardMediumSoftLongScore score ;

    //No arg constructor
    public SolutionEmployee() {
    }

    //SHift getter and setter method
    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    //employee getter and setter method
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public HardMediumSoftLongScore getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = (HardMediumSoftLongScore) score;
    }
}
