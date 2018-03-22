package com.dbservice.dbmicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployeesDetails() {
		return employeeService.getAllEmployeesDetails();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable String id) {
		return employeeService.getEmployeeDetails(id);
	}
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deteleEmployee(id);
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable String id,@RequestBody Employee employee) {
		employee.setEmpId(id);
		employeeService.updateEmplyoeeDetails(employee);
	}
}
