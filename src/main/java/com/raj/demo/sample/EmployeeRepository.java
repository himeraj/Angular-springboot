package com.raj.demo.sample;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Integer> {
    List<Employee> findAll();
    void save(Employee e);
}
