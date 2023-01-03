package com.yash.Java8NewFeature;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamDistinctFilterSortMapMethod {
 
    public static void main(String[] args) {
 
        // list of Strings
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
 
        // collect distinct sectors and filter, sort and map to lower Case
        List<String> distinctSectors = sectors
                .stream()
                .distinct() // removes duplicates
                .filter(str -> str.startsWith("C")) // filter
                .sorted() // natural alphabetical order
                .map(String::toLowerCase) // converts to lower case
                .collect(Collectors.toList());
 
        // print to console
        System.out.println("Sectors with distinct, filtered, sorted and mapped :- \n");
        distinctSectors.forEach(System.out::println);
    }
}