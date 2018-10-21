package com.raj.demo.sample;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    void save(Employee e);
    String delete(int employeeId);
    void update(Employee e);
    Optional<Employee> findOne(int id);
}
