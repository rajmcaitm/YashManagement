package com.yash.interview;

public class StringEqueals {

	public static void main(String[] args) {

		String a = "Ankur";
		String b = new String("Ankur");
		String c = a + b;

		String d = b.intern();
		System.out.println(a == b);// false
		System.out.println(a == b.intern());// true

		System.out.println(b == d);// false
		System.out.println(a == d);// true

		System.out.println(a.equals(b));// true
		System.out.println(b.equals(a));// true

	}

}
