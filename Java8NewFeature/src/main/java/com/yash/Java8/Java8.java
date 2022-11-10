package com.yash.Java8;

import java.util.ArrayList;

class Java8 {
	public static void main(String... args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}
}