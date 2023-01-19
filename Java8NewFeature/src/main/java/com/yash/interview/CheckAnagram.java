package com.yash.interview;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {

		System.out.println(checkEquality("test", "tset"));

	}

	private static boolean checkEquality(String input1, String input2) {
		boolean flag = false;
		String test1 = "";
		String test2 = "";
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			test1 = test1 + ch1[i];
		}

		for (int j = 0; j < ch2.length; j++) {
			test2 = test2 + ch2[j];
		}

		if (test1.equals(test2)) {
			flag = true;
		}

		return flag;

	}

}
