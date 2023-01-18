package com.yash.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountRepeatedNo {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 2, 4, 7, 8, 2);
		System.out.println(countRepeatedNo(al));

	}

	private static Map<Integer, Integer> countRepeatedNo(List<Integer> list) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			} else {
				map.put(list.get(i), 1);
			}
		}

		return map;

	}

}
