package com.raj.demo.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {

	@Id
    @Column(nullable = false, name="department_id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int departmentId;

    @Column(name="department_name")
    String departmentName;
    
    public Department() {
    	super();
    }

    public Department(int departmentId, String departmentName) {
    	super();
    	this.departmentId = departmentId;
    	this.departmentName = departmentName;
    }
    
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
