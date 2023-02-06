package com.yash.tech;

public class MaxMinValueInArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(getMinValue(arr));
		System.err.println(getMaxValue(arr));
		
	}

	public static int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
		      minValue = numbers[i];
		    }
		  }
		return minValue;
	
}
}