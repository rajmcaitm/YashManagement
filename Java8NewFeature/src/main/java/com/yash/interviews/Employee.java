package com.yash.interviews;

public class Employee {

private int empId;
private String empName;
private int empAge;
private int empSalary;
private String empLocation;
private int empDesignation;
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
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
public String getEmpLocation() {
	return empLocation;
}
public void setEmpLocation(String empLocation) {
	this.empLocation = empLocation;
}
public int getEmpDesignation() {
	return empDesignation;
}
public void setEmpDesignation(int empDesignation) {
	this.empDesignation = empDesignation;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
			+ ", empLocation=" + empLocation + ", empDesignation=" + empDesignation + "]";
}
public Employee(int empId, String empName, int empAge, int empSalary, String empLocation, int empDesignation) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAge = empAge;
	this.empSalary = empSalary;
	this.empLocation = empLocation;
	this.empDesignation = empDesignation;
}


}
