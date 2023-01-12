package com.yash.Java8NewFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSortedMethod {

	public static void main(String[] args) {

		System.out.println("Upper Case and Sorting : \n");

		// List object
		List<String> names = new ArrayList<>();

		// add few String values
		names.add("Stars");
		names.add("Earth");
		names.add("Sky");
		names.add("Wind");
		names.add("Fire");
		names.add("Water");
		names.add("Moon");

		List<String> list = names.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());

		list.forEach(result -> System.out.println(result));

	}
}
