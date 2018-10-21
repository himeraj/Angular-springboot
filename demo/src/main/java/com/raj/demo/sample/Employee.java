package com.raj.demo.sample;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(nullable = false, name="employee_id" )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    @Column(name="employee_name")
    private String employeeName;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Department.class)
    @JoinColumn(insertable=false)
    private Department department;
    
    @Column(name="department_id")
    private int departmentId;
    
    @Column(name="department_name")
    private String departmentName;

    public Employee() {

    }
    public Employee(String employeeName, int departmentId, String deptName){
        this.employeeName = employeeName;
        this.departmentId = departmentId;
        this.departmentName = deptName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}/*
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}*/
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
