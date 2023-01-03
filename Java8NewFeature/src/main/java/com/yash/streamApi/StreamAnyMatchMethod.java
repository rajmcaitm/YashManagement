package com.yash.streamApi;

import java.util.Arrays;
import java.util.List;
 
public class StreamAnyMatchMethod {
 
    public static void main(String[] args) {
 
        // 1. list of 10 natural numbers
        List<Integer> numbers = Arrays
                .asList(1,2,3,4,5,6,7,8,9,10);
 
        // 1.1 predicate to find number greater than 9
        boolean bool1 = numbers
                .stream()
                .anyMatch(num -> num > 9);
 
        // 1.2 print to console
        System.out.println("Original list of integers : " + numbers);
        System.out.println("\nWhether integer list contains"
                + " number greater than 9 = " + bool1);
 
        // 1.3 in line Predicate condition
        System.out.println("Whether integer list"
                + " contains number greater than 10 = "
                + numbers.stream()
                .anyMatch(num -> num > 10));
 
        // 2. list of 5 Strings
        List<String> sectors = Arrays.asList(
                "Motor", 
                "Power", 
                "Steel", 
                "Chemicals", 
                "Capital"
                );
 
        // 2.1 predicate to find whether String element present or Not
        boolean bool2 = sectors
                .stream()
                .anyMatch(str -> str.contains("Power"));
 
        // 2.2 print to console
        System.out.println("\n\nOriginal list of Strings : " + sectors);
        System.out.println("\nWhether String list contains"
                + " element 'Power' = " + bool2);
 
        // 2.3 in line Predicate condition
        System.out.println("Whether String list contains"
                + " element 'Consumer' = "
                + sectors.stream()
                .anyMatch(str -> str.contains("Consumer")));
    }
}