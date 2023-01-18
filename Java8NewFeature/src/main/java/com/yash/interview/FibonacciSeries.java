package com.yash.interview;

//Write a Java program for the Fibonacci series
public class FibonacciSeries {

	public static void main(String[] args) {
		printFibonacci();

	}

	private static void printFibonacci() {

		int i = 0;
		int j = 1;
		System.out.println(i + " " + j);

		for (int j2 = 0; j2 < 10; j2++) {
			int k = i + j;
			i = j;
			j = k;
			System.out.println(k);

		}

	}
}
