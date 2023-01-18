package com.yash.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write a program to find the first non repeating character in the given String
class RepeatedElementNotFound extends Exception {

	private static final long serialVersionUID = 1L;

	RepeatedElementNotFound(String name) {
		super(name);
	}
}

public class ForstNonRepeatChar {

	public static void main(String name[]) throws RepeatedElementNotFound {
		String str = "tteesstt";
		System.out.println("First repeated character : " + firstRepeatChar(str));
		System.out.println("First non repeated character : " + nonRepeatChar(str));
	}

	public static char firstRepeatChar(String str) {
		int i;
		char ch[] = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (i = 0; i < ch.length; i++) {
			if (!set.add(ch[i])) {
				return ch[i];
			}
		}
		return ch[i];

	}

	public static char nonRepeatChar(String str) throws RepeatedElementNotFound {
		int i;
		char ch[] = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (i = 0; i < ch.length; i++) {
			if (set.add(ch[i])) {
				set.add(ch[i]);
			} else {
				set.remove(ch[i]);
			}
		}

		List<Character> charList = new ArrayList<>(set);
		if (charList.size() == 0) {
			throw new RepeatedElementNotFound("Repeated char not found");
		}
		return charList.get(0);

	}
}