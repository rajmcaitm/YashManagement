package com.yash.Java8NewFeature;

public class StreamCountRepeatedChars {

	public static void main(String[] args) {

		String str = "zzzAzzNzzzIzzY";
	    char find = 'z';
	    char findA = 'A';
		
		System.out.println("Original length of String is " + str.length());

		// find count for character 'z'
		long count = str.chars().filter(n -> n==find).count();
		long countA = str.chars().filter(test->test =='A').count();
		
		System.out.println("\nCharacter '" + find + "' repeated " + count + " times");
		System.out.println("\nCharacter '" + findA + "' repeated " + countA + " times");
	}
}