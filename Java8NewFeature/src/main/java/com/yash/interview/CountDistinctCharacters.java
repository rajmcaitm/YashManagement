package com.yash.interview;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctCharacters {

	public static void main(String[] args) {
		String name = "aaryanna";
		String test = "aayanna";

		System.err.println(name + ": has " + countDisChar(name) + " distinct characters");
		System.err.println(test + ": has " + countDisChar(test) + " distinct characters");
	}

	private static int countDisChar(String str) {

		Set<Character> set = new HashSet<>();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		return set.size();

	}

}
