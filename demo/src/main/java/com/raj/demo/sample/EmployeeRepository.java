package com.raj.demo.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e JOIN Department d on e.departmentId = d.departmentId")
	List<Employee> findAllEmployees();
	
	@Modifying
	@Query("UPDATE Employee set employeeName = :empName, departmentName = :deptName, departmentId = :deptId WHERE employeeId = :empId")
	void updateEmployee(@Param("empName") String firstname, @Param("empId") int empId,
			@Param("deptName") String deptname, @Param("deptId") int deptId);
}
