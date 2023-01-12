package com.yash.Java8NewFeature;

@FunctionalInterface
interface DemoInterface {
	public int square(int n);
}

public class TestLambdaExpression {

	public static void main(String[] args) {

		DemoInterface d = (n) -> {
			return n * n;
		};

		System.out.println(d.square(5));
	}
}