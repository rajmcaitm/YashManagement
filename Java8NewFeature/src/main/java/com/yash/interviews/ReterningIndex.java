package com.yash.interviews;

import java.util.ArrayList;
import java.util.List;

public class ReterningIndex {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };//[0, 1, 2]
		int target = 9;
		System.out.println(returnIndex(arr, target));
	}

	public static List<Integer> returnIndex(int arr[], int target){

	List<Integer> al = new ArrayList<>();
	for(int i = 0; i< arr.length; i++){
	for(int j = i+1; j < arr.length; j++){
	if(arr[i] + arr[j]==target){
	al.add(i);
	}

	}
	}
	return al;

	}

	// Arrays.stream(arr).filter(n->n+n==traget).forEach(test->sop(test))

}
