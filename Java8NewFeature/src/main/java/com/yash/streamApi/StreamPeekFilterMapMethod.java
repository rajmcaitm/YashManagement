package com.yash.streamApi;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StreamPeekFilterMapMethod {
 
    public static void main(String[] args) {
 
        
        System.out.println("Filtering (str.length>3) and Mapping (str.UpperCase) :- \n");
        List<String> numbers = 
                Stream.of("one", "two", "three", "four") 
                .filter(e -> e.length() > 3) 
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase) 
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList()); 
 
        
        System.out.println("\n\nAfter filtering and mapping to UpperCase :- ");
        numbers.stream().forEach(System.out::println);
    }
}