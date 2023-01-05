package com.yash.collector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class SortArrayListOfIntegerUsingStream {
 
    public static void main(String[] args) {
 
        
        List<Integer> numbers = new ArrayList<>();
 
 
        
        numbers.add(86);
        numbers.add(19);
        numbers.add(97);
        numbers.add(63);
        numbers.add(23);
        numbers.add(92);
        numbers.add(94);
 
 
        
        
        List<Integer> sortedNumbers = numbers
                .stream()
                .sorted()
                .collect(Collectors.toList());
 
 
        
        System.out.println("\n. Natural order of "
                + "ArrayList<Integer> :- \n");
        sortedNumbers.forEach(System.out::println);
 
 
        
        List<Integer> reverseSortedNumber = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
 
 
        
        System.out.println("\n. Reverse order of "
                + "ArrayList<Integer> :- \n");
        reverseSortedNumber.forEach(System.out::println);
    }
}
