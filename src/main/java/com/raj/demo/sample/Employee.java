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
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="department_id")
    private Department department;

    public Employee() {

    }
    public Employee(int employeeId, String employeeName, Department department){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
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
}
