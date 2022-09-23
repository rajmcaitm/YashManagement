package com.yash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.EmployeeDao;
import com.yash.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public Employee getEmployee(int empId) {
//		Employee employee = empService.getEmployee(empId);
		Employee emp = new Employee();
		try {
			emp = convertToEmployee(empDao.findById(empId));
		} catch (Exception e) {
			System.out.println("exception while getting employee");
		}
		return emp;
	}

	private Employee convertToEmployee(Optional<Employee> emp) {
		Employee employee = new Employee();
		if (emp != null) {
			employee.setEmpId(emp.get().getEmpId());
			employee.setEmpName(emp.get().getEmpName());
			employee.setEmpAge(emp.get().getEmpAge());
			employee.setEmpMobileNo(emp.get().getEmpMobileNo());
			employee.setEmpAddress(emp.get().getEmpAddress());
			employee.setEmpSalary(emp.get().getEmpSalary());
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<>();
		try {
			empList = empDao.findAll();
		} catch (Exception e) {
			System.out.println("Exception while getting list of Employee");
		}
		return empList;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		Employee savedEmployee = new Employee();
		try {
			savedEmployee = empDao.save(emp);
		} catch (Exception e) {
			System.out.println("Exception while adding Employee");
		}
		return savedEmployee;
	}

	@Override
	public Employee modifyEmployee(Employee emp) {
		Employee employee = new Employee();
		try {
			employee = getEmployee(emp.getEmpId());

			if (employee != null) {
				employee.setEmpName(emp.getEmpName());
				employee.setEmpAge(emp.getEmpAge());
				employee.setEmpAddress(emp.getEmpAddress());
				employee.setEmpMobileNo(emp.getEmpMobileNo());
				employee.setEmpSalary(emp.getEmpSalary());
				empDao.save(employee);
			}

		} catch (Exception e) {
			System.out.println("Exception while modifing Employee");
		}
		return employee;
	}

	@Override
	public String removeEmployee(int empId) {
		Employee employee = new Employee();
		boolean flag = false;
		try {
			employee = getEmployee(empId);
			if (employee != null) {
				empDao.deleteById(empId);
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("Exception while removing Employee");
		}
		if (flag) {
			return "employee deleted Successfully with id= " + empId;
		} else {
			return "id " + empId + " does not exist";
		}
	}

}
