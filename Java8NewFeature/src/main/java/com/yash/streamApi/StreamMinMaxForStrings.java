package com.yash.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMinMaxForStrings {

	public static void main(String[] args) {

		// list of Strings
		List<String> names = Arrays.asList("Putin", "Biden", "Modi", "Ali", "Jack");

		// get minimum<string> from list of strings
		String minStr = names.stream().min(Comparator.comparing(String::valueOf)).get();

		System.out.println("Minimum String is = " + minStr);

		// get maximum<string> from list of strings
		String maxStr = names.stream().max(Comparator.comparing(String::valueOf)).get();

		System.out.println("Maximum String is = " + maxStr);
	}
}
