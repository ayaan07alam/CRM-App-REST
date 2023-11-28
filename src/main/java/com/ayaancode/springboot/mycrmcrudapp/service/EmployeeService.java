package com.ayaancode.springboot.mycrmcrudapp.service;

import java.util.List;

import com.ayaancode.springboot.mycrmcrudapp.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
