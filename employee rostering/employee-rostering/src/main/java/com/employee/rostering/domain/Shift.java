package com.employee.rostering.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import java.time.LocalDateTime;
import java.util.List;
/*planning Enitity:-> Planning entity wo entity hoti h jiske liye kai planning variable hote
*  h.
*   For example in n queens, a Queen is defined by its Column and has a planning variable Row. This means that a Queen’s column never changes during solving, while its row does change.*/
//Beacasue yha shift bdlegi har employee ke hisaasb  se esliye ye planing entity hogi

//Plan krni h kis shift ko konse employee ko de
@PlanningEntity
public class Shift {
    private Long id;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    private List<Skill> skills;
    //wo variable jine hum planning entity k hisaab se bdl dete h
    @PlanningVariable(valueRangeProviderRefs = "employeeRange")
    private Employee employee;

/*With @PlanningPin (see docs) or immableEntityFilter (see docs), you can pin assignments during repeated planning (such as continuous planning)
so OptaPlanner doesn't change those entities but still respects them for the constraints.*/
    @PlanningPin
    private boolean isPinned;

    public Shift() {
    }
    public boolean hasRequiredSkills(){
        return employee.getSkills().containsAll(skills);
    }

    public  Long  getLengthInMinutes(){
        return 10L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    //Setter and getter method for startDateTime
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    //Setter and getter method for endDateTime
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    //Setter and Getter Method For skill
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    //Setter and Getter Method for Employee
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //ALl arg constructor

    public Shift(Long id, LocalDateTime startDateTime, LocalDateTime endDateTime, List<Skill> skills, Employee employee) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.skills = skills;
        this.employee = employee;
    }
}
