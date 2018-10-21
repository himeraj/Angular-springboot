package com.raj.demo.sample;

import java.util.List;

public interface DepartmentService {

	List<Department> findAll();
	void saveDepartment(Department department);
	Department findById(int id);
}
