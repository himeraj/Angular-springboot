package com.raj.demo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    
    @Autowired
    private DepartmentService departmentService;

    @Override
    public List<Employee> findAll() {
    	createEmployeeData();
        return repository.findAll();
    }
    
    private void createEmployeeData() {
    	Department hrDept = new Department(1, "HR");
		departmentService.saveDepartment(hrDept);
		Department adminDept = new Department(2, "Admin");
		departmentService.saveDepartment(adminDept);
		
		repository.save(new Employee(1, "Raj", hrDept));
		repository.save(new Employee(2, "Hime", hrDept));
		repository.save(new Employee(3, "Jack", adminDept));
		repository.save(new Employee(4, "Ryan", adminDept));
		repository.save(new Employee(5, "Hevertlee", adminDept));
    }
}
