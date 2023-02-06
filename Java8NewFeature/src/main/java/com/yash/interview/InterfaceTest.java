package com.yash.interview;

interface Test1 {
	int doSomething();
}

interface Test2 {
	int doSomething();
}

public class InterfaceTest implements Test1, Test2 {

	@Override
	public int doSomething() {
		System.out.println("Interface test");
		return 5;

	}

	public static void main(String[] args) {

		int val = new InterfaceTest().doSomething();
		System.err.println(val);
	}
}