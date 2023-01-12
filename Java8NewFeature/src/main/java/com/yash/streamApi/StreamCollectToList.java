package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamCollectToList {
 
    public static void main(String[] args) {
 
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Original numbers :- "
                + numbers);
 
        
        List<Integer> doubledNumbers = numbers
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
 
        
        System.out.println("Doubled numbers  :- "
                + doubledNumbers);
 
        
        List<String> names = Arrays.asList(
                "Viraj",
                "Suresh",
                "Krishnanand",
                "Aditya",
                "Rishi"
                );
        System.out.println("\nOriginal list of names :- "
                + names);
 
        
        List<String> namesContainingI = names
                .stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toList());
 
        
        System.out.println("Names containing 'i'   :- "
                + namesContainingI);
    }
}