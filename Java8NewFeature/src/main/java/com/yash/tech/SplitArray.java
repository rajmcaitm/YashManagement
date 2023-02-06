package com.yash.tech;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {

		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		int subArrays[] = splitArray(original, splitSize);
		System.out.println(Arrays.toString(subArrays));
		

	}

	public static int[] splitArray(int[] array, int splitSize) {
		int arr[]=null;
		
		for (int i = 0; i < (array.length) / 3; i++) {
			 arr = Arrays.stream(array).limit(splitSize).toArray();
			 splitSize = splitSize+1;
			System.out.println(Arrays.toString(arr));
			
		}
		return arr;

	}
}
