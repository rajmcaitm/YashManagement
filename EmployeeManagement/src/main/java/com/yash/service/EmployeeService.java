package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Employee;


public interface EmployeeService {

	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee emp);
	public Employee modifyEmployee(Employee emp);
	public String removeEmployee(int empId);
}
