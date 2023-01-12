package com.yash.interview;

interface A {
	void display();
}

interface B {
	void display();
}

public class TestInterface implements A, B {

	@Override
	public void display() {
		System.out.println("Interface A");

	}
	
	
	public static void main(String[] args) {
		TestInterface test = new TestInterface();
		test.display();//interface A method will called
		
	}
	
}
