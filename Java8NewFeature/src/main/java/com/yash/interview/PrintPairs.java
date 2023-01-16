package com.yash.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PrintPairs {

	public static void main(String name[]) {

		int arr[] = { 2, 6, 3, 9, 11, 3, 6 };
		Arrays.sort(arr);
		int sum = 9;
		System.out.println(printPair(arr, sum));
	}

	public static Map<Integer, Integer> printPair(int arr[], int sum) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					map.put(arr[i], arr[j]);
				}
			}
		}
		return map;
	}
}
