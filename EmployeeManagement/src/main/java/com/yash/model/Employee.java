package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	private int empAge;
	private long empMobileNo;
	private Address empAddress;
	private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public long getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Employee(int empId, String empName, int empAge, long empMobileNo, Address empAddress, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empMobileNo = empMobileNo;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empMobileNo="
				+ empMobileNo + ", empAddress=" + empAddress + ", empSalary=" + empSalary + "]";
	}

}
