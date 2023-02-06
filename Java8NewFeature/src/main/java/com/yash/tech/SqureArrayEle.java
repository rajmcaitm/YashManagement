package com.yash.tech;

import java.util.Arrays;

public class SqureArrayEle {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 4, 2 };
		System.err.println(Arrays.toString(returnSquare(arr1)));
		System.err.println(Arrays.toString(returnDistinctSquareNo(arr2)));
		

	}

	// without stream
	public static int[] returnSquare(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		return arr;

	}

	public static int[] returnDistinctSquareNo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		return Arrays.stream(arr).distinct().toArray();

	}

}
