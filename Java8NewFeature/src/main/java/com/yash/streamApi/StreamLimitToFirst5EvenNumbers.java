package com.yash.streamApi;

import java.util.stream.Stream;

public class StreamLimitToFirst5EvenNumbers {
 
    public static void main(String[] args) {
 
        System.out.println("List of integer after "
                + "limiting to first 5 EVEN numbers :- \n");
 
        // skip first 2 numbers and print remaining
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        .filter(i -> i%2 == 0)
        .limit(5)
        .forEach(System.out::println);
    }
}