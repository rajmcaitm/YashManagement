package com.yash.tech;

import java.util.Arrays;
public class SecondHighestEle {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 3, 1, 6, 5 };
		System.out.println(secondHighest(arr));
		System.out.println(secondHighestWithout(arr));
	}

	public static int secondHighest(int arr[]) {

		int res[] = Arrays.stream(arr).sorted().toArray();

		return res[res.length - 2];

	}

	public static int secondHighestWithout(int arr[]) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr[arr.length - 2];

	}
}
