package com.raj.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;

	@Override
	public List<Department> findAll() {
		return departmentRepo.findAll();
	}

	@Override
	public void saveDepartment(Department department) {
		departmentRepo.save(department);
	}

}
