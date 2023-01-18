package com.yash.interview;

class Class {

	public static void main(String[] args) {
		String s = "sunday monday tuesday";
		System.out.println(reverseAndCombile(s));
	}

	public static String reverseAndCombile(String day) {
		String result = "";
		String name[] = day.split(" ");
		for (int i = 0; i < name.length; i++) {
			result = result + reverseString(name[i]) + " ";
		}
		return result;
	}

	public static String reverseString(String day) {
		String result = "";
		char name[] = day.toCharArray();
		for (int j = name.length - 1; j >= 0; j--) {
			result = result + name[j];
		}
		return result;
	}

}
