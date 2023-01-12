package com.yash.collector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class SortingIntegerList {
 
    public static void main(String[] args) {
 
       
        List<Integer> numbers = Arrays.asList(
                63, 19, 86, 97, 7, 10, 67
                );
 
 
       
        System.out.println("Original numbers as per Insertion-order");
        numbers.forEach(System.out::println);
 
 
 
        
        System.out.println("Ascending order sorted numbers"
                + " using Comparator.naturalOrder()");
 
 
        numbers
        .stream()
        .sorted(Comparator.naturalOrder())
        .forEach(System.out::println);
 
 
        
        System.out.println("Descending order sorted numbers"
                + " using Comparator.reverseOrder()");
 
 
        numbers 
        .stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
        
    }
}
