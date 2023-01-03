package com.yash.Java8NewFeature;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class StreamDistinctMethod {
 
    public static void main(String[] args) {
 
        // 1. list of integers
        List<Integer> numbers = Arrays.asList(
                1,
                2,2,
                3,3,3,
                4,4,4,4,
                5,5,5,5,5
                );
 
        // collect distinct numbers
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
 
        // print to console
        System.out.println("1. Distinct numbers are :- \n");
        distinctNumbers.forEach(number -> System.out.println(number));
 
        // get count of distinct elements
        long numberCount = numbers.stream().distinct().count();
 
        // print to console
        System.out.println("\ncount of distinct Numbers = "
                + numberCount);
 
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
               .collect(Collectors.toSet());
 
        // print to console
        System.out.println("\n\n2. Distinct sectors are :- \n");
        distinctSectors.forEach(System.out::println);
 
        // get count of distinct sectors
        long sectorCount = sectors.stream().distinct().count();
 
        // print to console
        System.out.println("\ncount of distinct Sectors = "
                + sectorCount);
    }
}
