package com.dbservice.dbmicroservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository empRepository;

	public List<Employee> getAllEmployeesDetails(){
		List<Employee> empList = new ArrayList<>(); 
		empRepository.findAll().forEach(emp->empList.add(emp));
		return empList;
	}

	public void addEmployee(Employee employee) {
		empRepository.save(employee);
		
	}

	public Employee getEmployeeDetails(String id) {
		return empRepository.findByEmpId(id);
	}

	public void deteleEmployee(String id) {
		empRepository.deleteById(id);
	}

	public void updateEmplyoeeDetails(Employee employee) {
		empRepository.save(employee);
		
	}
	
	
}
