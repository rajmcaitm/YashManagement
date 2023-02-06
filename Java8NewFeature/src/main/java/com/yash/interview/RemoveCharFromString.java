package com.yash.interview;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String first = "welcomea toa javaaaa";
		String second = "a";
		System.out.println(removeCharFromFirstString(first, second));// welcome to jv
	}

	private static String removeCharFromFirstString(String first, String second) {

		char ch1[] = first.toCharArray();
		char ch2[] = second.toCharArray();
		String res = "";
		for (int i = 0; i < ch1.length; i++) {
			if (first.charAt(i) == ch2[0]) {

			} else {
				res = res + first.charAt(i);
			}
		}

		return res;
	}

}
