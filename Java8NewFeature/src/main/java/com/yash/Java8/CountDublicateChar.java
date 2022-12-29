package com.yash.Java8;

import java.util.HashMap;
import java.util.Map;

public class CountDublicateChar {

	public static void main(String[] args) {
		String str = "aaabbccccd";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (Character.isAlphabetic(arr[i])) {
				if (charMap.containsKey(arr[i])) {
					charMap.put(arr[i], charMap.get(arr[i]) + 1);

				} else {
					charMap.put(arr[i], 1);
				}
			}
		}

		System.out.println(charMap);//{a=3, b=2, c=4, d=1}
	}

}