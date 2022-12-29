package com.yash.Java8;

import java.util.Scanner;

public class Count100 {

	public static void test() {
		
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		checkNo(num1);
		}
	
	public static void checkNo(int num) {
		if (num >= 100) {
			System.out.println("Please enter a number less than 100");
		}
	}

	public static final void main(String[] args) {
		test();
	}

}
