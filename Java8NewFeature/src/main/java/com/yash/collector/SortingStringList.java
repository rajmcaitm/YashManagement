package com.yash.collector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
 
public class SortingStringList {
 
    public static void main(String[] args) {
 
       
        List<String> names = Arrays.asList(
                "Salman Khan",
                "Ranbir Kapoor",
                "Aamir Khan",
                "Hrithik Roshan",
                "Akshay Kumar",
                "Sharukh Khan",
                "Ranveer Singh"
                );
 
 
        
        System.out.println("Names as per insertion order in List) :- \n");
        names.forEach(System.out::println); 
 
 
 
        
        System.out.println("\nAlphabetically sorted names"
                + " using Comparator.naturalOrder() :- \n");
 
        names 
        .stream()
        .sorted(Comparator.naturalOrder())
        .forEach(System.out::println);
 
 
        
        System.out.println("\nReverse alphabetically sorted names"
                + " using Comparator.naturalOrder() :- \n");
 
 
        names 
       .stream()
       .sorted(Comparator.reverseOrder())
       .forEach(System.out::println);
    }
}