package com.yash.collector;

public class Student {
	
	private int rollNumber;
    private String name;
    private int age;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
    
    

}
