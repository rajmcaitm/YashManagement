package com.yash.interview;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int sum =0;
			int arr[] = new int[]{1,2,3};
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i]; 
			}
			System.out.println("sum: "+sum);
		} catch (Exception e) {
			System.out.println("Exception was caught!");
		}//catch (IndexOutOfBoundsException e) { //Unreachable catch block for IndexOutOfBoundsException. It is already handled by the catch block for Exception
			//System.out.println("IndexOutOfBoundsException was caught!");
		//}
	}

}
