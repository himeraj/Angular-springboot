package com.raj.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		/*departmentRepository.deleteAll();
		createdata();*/
		return (List<Department>) departmentRepository.findAll();
	}

	private void createdata() {
		// TODO Auto-generated method stub
		Department hrDept = new Department("HR");
    	departmentRepository.save(hrDept);
		Department adminDept = new Department("Admin");
		departmentRepository.save(adminDept);
	}

	@Override
	public void saveDepartment(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public Department findById(int id) {
		List<Department> dep = (List<Department>) departmentRepository.findAll();
		for (Department department : dep) {
			if(department.departmentId == id) 
				return department;
		}
		return null;
	}

}
