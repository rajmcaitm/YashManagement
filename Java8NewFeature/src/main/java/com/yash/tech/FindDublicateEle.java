package com.yash.tech;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDublicateEle {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 2, 2, 6, 6, 6, 6);
		System.out.println(getDublicate(list));
		System.out.println(interChangeElement(list));// [6, 2, 2, 6, 6, 6, 10]

	}

	public static Set<Integer> getDublicate(List<Integer> list) {

		System.out.println("First Element of the ArrayList :" + list.get(0));
		System.out.println("Last Element of the ArrayList :" + list.get(list.size() - 1));

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {

			if (set1.add(list.get(i))) {

			} else {
				set2.add(list.get(i));
			}
		}
		return set2;
	}

	public static List<Integer> interChangeElement(List<Integer> list) {

		Collections.swap(list, 0, list.size() - 1);

		return list;
	}

}