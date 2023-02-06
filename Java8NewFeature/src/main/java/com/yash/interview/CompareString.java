package com.yash.interview;

public class CompareString {

	public static void main(String[] args) {

		String a = "string";
		String b = new String("string");
		String c = a;

		System.out.println(a == b);//false
		System.out.println(a == c);//true
		System.out.println(b.equals(c));//true
	}

}
