package com.yash.Java8;

public class CountChar {

	public static String count(String str) {
		int count1 = 1;
		int count2 = 1;
		int count3 = 1;
		int count4 = 1;
		String combine1 = "";
		String combine2 = "";
		String combine3 = "";
		String combine4 = "";

		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ('a' == ch[i]) {
				combine1 = "a" + count1++;
			} else if ('b' == ch[i]) {
				combine2 = "b" + count2++;
			} else if ('c' == ch[i]) {
				combine3 = "c" + count3++;

			} else if ('d' == ch[i]) {
				combine4 = "d" + count4++;

			}
		}
		return combine1 + combine2 + combine3 + combine4;
	}

	public static void main(String[] args) {
		System.out.println(count("aaabbccccd"));// a3b2c4d1    

	}

}
