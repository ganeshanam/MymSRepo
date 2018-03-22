package com.dbservice.dbmicroservice;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, String>{
	public Employee findByEmpId(String id);

}
