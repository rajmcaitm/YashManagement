package com.yash.streamApi;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		int arr[] = {1, 8, 3, 7, 6 };
		System.out.println(Arrays.toString(sortingArrayEle(arr)));
		System.out.println(Arrays.toString(sortingArrayEleUsingJava8(arr)));
		

	}

	//Custom logic for sorting
	private static int[] sortingArrayEle(int arr[]) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;

	}
	
	//using java 8 
	private static int[] sortingArrayEleUsingJava8(int arr[]) {

		Arrays.stream(arr).sorted();

		return arr;

	}

}
