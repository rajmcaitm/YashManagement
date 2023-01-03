package com.yash.Java8NewFeature;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamDistinctMapMethod {
 
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
 
        // collect distinct sectors and map to upper Case
        List<String> distinctSectors = sectors
                .stream()
                .distinct() // removes duplicates
                .map(String::toUpperCase) // converts to upper case
                .collect(Collectors.toList());
 
        // print to console
        System.out.println("Distinct sectors in upper case :- \n");
        distinctSectors.forEach(System.out::println);
    }
}