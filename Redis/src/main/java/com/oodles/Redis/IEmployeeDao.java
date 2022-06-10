package com.oodles.Redis;

import java.util.Map;

public interface IEmployeeDao {
    void saveEmployee(Employee emp);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee emp);
    void deleteEmployee(Integer id);
    Map<Integer,Employee>getAllEmployees();
    void saveAllEmployees(Map<Integer,Employee>map);
}
