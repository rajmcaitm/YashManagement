package com.yash.tech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWith {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Sam", "Smith");

		names = names
				.stream()
				.filter(name -> name
						.startsWith("A"))
				.collect(Collectors.toList());
		
		
		names.forEach(System.out::println);
	}

}
