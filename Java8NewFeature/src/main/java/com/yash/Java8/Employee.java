package com.yash.Java8;

public class Employee {

	private int empId;
	private String empName;
	private long empMobile;
	private String empLocation;
	private int empPin;

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

	public long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public int getEmpPin() {
		return empPin;
	}

	public void setEmpPin(int empPin) {
		this.empPin = empPin;
	}

	public Employee(int empId, String empName, long empMobile, String empLocation, int empPin) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
		this.empLocation = empLocation;
		this.empPin = empPin;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMobile=" + empMobile + ", empLocation="
				+ empLocation + ", empPin=" + empPin + "]";
	}
	
	

}
