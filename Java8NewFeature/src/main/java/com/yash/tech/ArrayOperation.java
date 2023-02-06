package com.yash.tech;

import java.util.ArrayList;
import java.util.List;

/*
1.Write the program to left out all 2's in array by using single loop;
int [] a ={1,9,2,5,2,1,2,3,1}; o/p a[]={ 2,2,2,5,9,1,1,3,1}*/

public class ArrayOperation {

	public static void main(String[] args) {

		int[] a = { 1, 9, 2, 5, 2, 1, 2, 3, 1 };
		System.out.println(allTwosletf(a));

	}

	public static List<Integer> allTwosletf(int arr[]) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				list.add(arr[i]);
			} else {
				list1.add(arr[i]);
			}
		}

		list.addAll(list1);
		return list;

	}

}
