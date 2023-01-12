package com.yash.Java8NewFeature;

import java.util.HashMap;

public class CountRepeatedEle {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 5, 3, 4, 3, 2, 4, 2, 1, 6, 0 };

		System.out.println(countElement(arr));

	}

	public static HashMap<Integer, Integer> countElement(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}

		return map;

	}

}
