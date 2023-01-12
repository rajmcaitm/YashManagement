package com.yash.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMinMaxForNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// get minimum number from list of integers
		int minNumber = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("Minimum number is = " + minNumber);

		// get maximum number from list of integers
		int maxNumber = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("Maximum number is = " + maxNumber);
	}
}