package com.yash.interview;


interface Sayable {
	void say();
}

public class StaticMethodReferenceEx {
	
	public static void main(String[] args) {
		
		Sayable sayable = StaticMethodReferenceEx::saySomething;
		sayable.say();
	}
	
	static void saySomething() {
		System.out.println("Hello, this is static method.");  
	}

}
