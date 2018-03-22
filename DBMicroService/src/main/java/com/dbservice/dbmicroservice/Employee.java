package com.dbservice.dbmicroservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	public String empId;
	public String employeeName;
	public String department;
	public String role;
	
	public Employee() {
		
	}

	public Employee(String empId, String employeeName, String department, String role) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.department = department;
		this.role = role;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", department=" + department + ", role="
				+ role + "]";
	}
	
	
	

}
