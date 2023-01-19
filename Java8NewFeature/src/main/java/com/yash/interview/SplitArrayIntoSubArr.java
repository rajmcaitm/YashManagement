package com.yash.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SplitArrayIntoSubArr {
	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */

	List<int[]> list = splitArray(original, splitSize);
    list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	
	}
	
	

public static List<int[]> splitArray(int[] array, int splitSize) {
	
	List<int[]> addList = new ArrayList<>();
	int count = 0;
	int[] arr1= new int[3];
	int[] arr2= new int[3];
	int[] arr3= new int[3];
	int[] arr4= new int[1];
	
	
	for (int i = 0; i < array.length; i++) {
		if(i <= splitSize) {
		arr1[i] = array[i];
		//System.err.println(Arrays.toString(arr1));
		}else if(i >= 2*splitSize){
			arr2[i] = array[i];
		}else if(i >= 3*splitSize){
			arr3[i] = array[i];
	}else if(i >= 4*splitSize){
		arr4[i] = array[i];
	}
	}
	
	return null;
		
	
		
	}
}
