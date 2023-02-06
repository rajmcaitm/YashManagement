package com.yash.interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnDublicateElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,1,3);
		System.out.println(returnDublicateElement(list));
		
	}

	public static Set<Integer> returnDublicateElement(List<Integer> list) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			if (set1.add(list.get(i))) {
			} else {
				set2.add(list.get(i));

			}

		}
		return set1;
	}
}
