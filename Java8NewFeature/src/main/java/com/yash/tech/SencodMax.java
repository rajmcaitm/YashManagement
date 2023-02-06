package com.yash.tech;

import java.util.Arrays;
import java.util.Comparator;

public class SencodMax {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 8, 2, 9 };

		System.out.println("second Max Element :" + secondMaxEle(arr));
		System.out.println("First Max Element :" + MaxEle(arr));
		System.out.println("second min Element :" + secondMinEle(arr));
		System.out.println("First min Element :" + firstMinEle(arr));
		System.out.println("sum of all element :" + sumOfAllElement(arr));
		System.out.println("Find Second Largest No :" + FindSecondLargestNo(arr));
		System.out.println("Find Second Largest Number :" + FindSecondLargestNumber(arr));
		System.out.println("Find first least Number :" + FindFirstLeastNumber(arr));
		System.out.println("Find second least Number :" + FindSecondLeastNumber(arr));
		
		
		

	}

	public static int secondMaxEle(int arr[]) {

		int[] sortedArray = Arrays.stream(arr).sorted().toArray();

		return sortedArray[sortedArray.length - 2];

	}

	public static int MaxEle(int arr[]) {

		int[] sortedArray = Arrays.stream(arr).sorted().toArray();

		return sortedArray[sortedArray.length - 1];

	}

	public static int secondMinEle(int arr[]) {

		int[] sortedArray = Arrays.stream(arr).sorted().toArray();

		return sortedArray[1];

	}

	public static int firstMinEle(int arr[]) {

		int firstMin = Arrays.stream(arr).sorted().min().getAsInt();

		return firstMin;

	}
	
	public static int sumOfAllElement(int arr[]) {

		int sumAll = Arrays.stream(arr).sum();

		return sumAll;

	}

	
	public static int FindSecondLargestNo(int arr[]) {

		int secondLargestNumber = Arrays
	            .stream(arr)
	            .boxed()
	            .sorted(Comparator.reverseOrder())
	            .skip(1)
	            .findFirst()
	            .get();
		return secondLargestNumber;	

	}
	
	
	public static int FindSecondLargestNumber(int arr[]) {

		int secondLargestNumber = Arrays
	            .stream(arr)
	            .boxed()
	            .sorted(Comparator.reverseOrder())
	            .limit(2)
	            .skip(1)
	            .findFirst()
	            .get();
		return secondLargestNumber;	

	}
	
	public static int FindFirstLeastNumber(int arr[]) {

		int findFirstNumber = Arrays
	            .stream(arr)
	            .boxed()
	            .sorted()
	            .limit(1)
	            .findFirst()
	            .get();
		return findFirstNumber;	

	}
	
	public static int FindSecondLeastNumber(int arr[]) {

		int findSecondLeastNumber = Arrays
	            .stream(arr)
	            .boxed()
	            .sorted()
	            .limit(2)
	            .skip(1)
	            .findFirst()
	            .get();
		return findSecondLeastNumber;	

	}

}
