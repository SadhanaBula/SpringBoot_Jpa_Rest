package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	Optional<Employee> getEmployeeById(int empid);
	
	String deleteEmployee(int empid);
	
	List<Employee> getAllEmployee();

}