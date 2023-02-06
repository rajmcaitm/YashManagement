package com.yash.tech;

public class FindNoOfEleOccourence {
	
	public static void main(String[] args) {
		
		int arr[] = {1,8,3,4,8,6,7,8,8};
		int match = 8;
		
		System.err.println(checkElement(arr, match));
		System.err.println("Occourances of "+match+" is :"+countTargetElement(arr, match));
		
	}
	
	public static boolean checkElement(int arr[], int match) {
		
	boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==match) {
				found = true;
				break;
			}else {
				
				found = false;
			}
		}
		
		return found;
		
	}
	
	public static int countTargetElement(int arr[], int match) {
		
		int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==match) {
					count++;
				}
			}
			return count;
		}
	}
