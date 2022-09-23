package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping("/getEmployeeById/{getId}")
	public Employee getEmployee(@PathVariable("getId") int getId) {
		Employee employee = empService.getEmployee(getId);
		return employee;
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployee(){
		List<Employee> getAllEmployee = empService.getAllEmployee();
		return getAllEmployee;
	}
	
	@GetMapping(path="/getallEmployees",produces = MediaType.APPLICATION_XML_VALUE)
	public List<Employee> AllEmployee(){
		List<Employee> getAllEmployee = empService.getAllEmployee();
		return getAllEmployee;
	}
	
	@PostMapping("/insertEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee addEmployee = empService.addEmployee(emp);
		return addEmployee;
	}
	
	@PutMapping("/updateEmployee/{empId}")
	public Employee modifyEmployee(@RequestBody Employee emp) {
		Employee modifyEmployee = empService.modifyEmployee(emp);
		return modifyEmployee; 
	}
	
	@DeleteMapping("/deleteEmployee/{deleteId}")
	public String removeEmployee(@PathVariable("deleteId") int deleteId) {
		String removeEmployee = empService.removeEmployee(deleteId);
		return removeEmployee;
	}

}
