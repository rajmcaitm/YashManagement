package com.yash.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SplitArrayIntoSubArr {
	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */

	Map<Integer, int[]> map = splitArray(original, splitSize);
    map.forEach((key,val)->System.err.println(key+" "+Arrays.toString(val)));
	
	}
	
	
	
	
	

public static Map<Integer, int[]> splitArray(int[] array, int splitSize) {
	int count = 0;
	Map<Integer, int[]> mapArray = new HashMap<>();
	for (int i = 0; i < (array.length)/3; i++) {
	int arr[] = Arrays.stream(array).limit(splitSize+1).toArray();
	mapArray.put(count, arr);
	count++;
	}
	return mapArray;
		
	}
}
