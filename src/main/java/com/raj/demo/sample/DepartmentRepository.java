package com.raj.demo.sample;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department, Integer> {
	List<Department> findAll();
	void save(Department department);
}
