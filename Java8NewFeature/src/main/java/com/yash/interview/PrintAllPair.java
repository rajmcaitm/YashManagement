package com.yash.interview;

import java.util.Arrays;
import java.util.HashMap;

public class PrintAllPair {

	public static void main(String[] args) {

		int[] array = { 1, 3, 2, 5, 4, 3, 1 };
		Arrays.sort(array);
		int key = 2;
		System.out.println(printUniquePair(array, key)); // O/P 1,3. 2,4. 3,5

		System.out.println(thirdLargestNo(array));
		System.out.println(thirdLargest(array));

	}

	private static HashMap<Integer, Integer> printUniquePair(int[] array, int key) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] - array[j] == key || array[j] - array[i] == key) {
					map.put(array[i], array[j]);

				} 
			}

		}

		return map;
	}

	// Third Largest element without array sorting
	static int thirdLargest(int arr[]) {
	
// Find first largest element

		int first = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > first)
				first = arr[i];

// Find second largest element

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];

// Find third largest element

		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];

		return third;
	}

	
	//third Largest No with sorting
	public static int thirdLargestNo(int array[]) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}
		}

		return array[array.length - 3];

	}

}
