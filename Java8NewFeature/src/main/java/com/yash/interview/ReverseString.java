package com.yash.interview;

//Write a Java program to reverse a string without using string inbuilt function
public class ReverseString {

	public static void main(String[] args) {
		String string = "welcome";
		System.out.println(reverseStrings(string));

	}

	private static String reverseStrings(String string) {
		String result = "";
		char ch[] = string.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			result = result + ch[i];

		}

		return result;
	}

}
