package com.yash.Java8;

public class OddEven {

	public static void printOddEvenNo(int arr[]) throws InterruptedException {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Thread.sleep(1000);
				System.out.println("Dharm Raj Chaudhary");
				Thread.sleep(1000);
			} else {
				Thread.sleep(1000);
				System.out.println("Mahima Patel");
				Thread.sleep(1000);

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printOddEvenNo(arr);
	}

}
