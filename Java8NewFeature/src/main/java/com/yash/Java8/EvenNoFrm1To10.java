package com.yash.Java8;

import java.util.ArrayList;

public class EvenNoFrm1To10 {

	public static void printEvenNo(ArrayList<Integer> list) {

		list.stream().filter(n -> n % 2 == 0).forEach(test -> System.out.println(test));

	}

	public static void printOddNo(ArrayList<Integer> list) {

		list.stream().filter(n -> n % 2 != 0).forEach(test -> System.out.println(test));

	}

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		printEvenNo(list);
		System.out.println("_______________________________________");
		printOddNo(list);
	}

}
