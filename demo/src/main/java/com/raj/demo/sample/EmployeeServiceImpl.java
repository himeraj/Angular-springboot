package com.raj.demo.sample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAllEmployees();
    }
    
	public Optional<Employee> findOne(int id) {
    	return employeeRepository.findById(id);
    }

	@Override
	public void save(Employee e) {
		employeeRepository.save(e);
	}

	@Override
	@Transactional
	public void update(Employee e) {
		employeeRepository.updateEmployee(e.getEmployeeName(), e.getEmployeeId(), e.getDepartmentName(), e.getDepartmentId());
	}

	@Override
	public String delete(int employeeId) {
		List<Employee> empList = findAll();
		for (Employee employee : empList) {
			if(employee.getEmployeeId() == employeeId)
				employeeRepository.delete(employee);
		}
		return "Employee deleted Successfully";
	}
}
