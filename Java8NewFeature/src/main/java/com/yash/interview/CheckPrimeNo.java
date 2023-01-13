package com.yash.interview;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	private static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
