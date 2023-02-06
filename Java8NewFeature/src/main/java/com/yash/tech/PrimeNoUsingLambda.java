package com.yash.tech;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/*2.List out the prime number between 1 to 40 by java streams and lambda
output : 2,3,5,7,11,13,17,19,23,29,31,37
*/
public class PrimeNoUsingLambda {

	public static void main(String[] args) {
		
		System.out.println(checkPrime(19));
		
		for (int i = 0; i < 40; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ,");
			}
		}

	}

	public static boolean isPrime(int n) {

		if (n == 1 || n == 0) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static boolean checkPrime(int number) {
	    IntPredicate isDivisible = index -> number % index == 0;
	    return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	  }
	
}