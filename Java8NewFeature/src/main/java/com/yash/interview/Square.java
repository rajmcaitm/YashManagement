package com.yash.interview;
// Java program to demonstrate lambda expressions to
// implement a user defined functional interface.

@FunctionalInterface

interface Square {
	int calculate(int x);
}

class Test {
	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}
