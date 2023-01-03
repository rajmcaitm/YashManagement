package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
 
public class ConvertStringToInt {
 
    public static void main(String[] args) {
 
        // list of Strings
        List<String> numbers = Arrays.asList(
                "19", 
                "63", 
                "97",
                "93",
                "86"
                );
 
        // 1.1 string to int using mapToInt - lambda expression
        IntStream intStreamLEx = numbers
                .stream()   
                .mapToInt(str -> Integer.parseInt(str)); // mapToInt
 
        // 1.2 print to console
        System.out.println("1. String to int using mapToInt() -"
                + " Lambda Expression :- \n");
        intStreamLEx.forEach(System.out::println);
 
 
        // 2.1 string to int using mapToInt - method reference
        IntStream intStreamMRef = numbers
                .stream()
                .mapToInt(Integer::parseInt); // mapToInt
 
        // 2.2 print to console
        System.out.println("\n2. String to int using mapToInt() -"
                + " Method Reference :- \n");
        intStreamMRef.forEach(System.out::println);
    }
}