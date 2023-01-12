package com.yash.Java8NewFeature;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class StreamDistinctFilterMethod {
 
    public static void main(String[] args) {
 
        // 1. list of integers
        List<Integer> numbers = Arrays.asList(
                1,
                2,2,
                3,3,3,
                4,4,4,4,
                5,5,5,5,5
                );
 
        // collect distinct elements and filter ODD numbers
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .filter(num -> num%2 != 0)
                .collect(Collectors.toList());
 
        // print to console
        System.out.println("1. Distinct ODD numbers are :- \n");
        distinctNumbers.forEach(number -> System.out.println(number));
 
        // 2. list of Strings
        List<String> sectors = Arrays.asList(
                "Motor", 
                "Power",
                "Steel", 
                "Chemicals",
                "Chemicals",
                "Power",
                "Steel",
                "Capital",
                "TCS",
                "Motor", 
                "Power",
                "Communications"
                );
 
        // collect distinct sectors
        Set<String> distinctSectors = sectors
                .stream()
                .distinct()
                .filter(str -> str.startsWith("C"))
                .collect(Collectors.toSet());
 
        // print to console
        System.out.println("\n\n2. Distinct sectors "
                + "which starts with alphabet 'C' :- \n");
        distinctSectors.forEach(System.out::println);
    }
}