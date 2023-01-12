package com.yash.Java8NewFeature;

@FunctionalInterface
interface Demo {
	// SAM
	void sum(int a, int b);
}

public class AddNumbers {

	// static method which has same implementation
	public static void add(int x, int y) {

		// similar to above lambda expression
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		// method reference using :: operator
		Demo i = AddNumbers::add;
		i.sum(25, 75);
	}
}