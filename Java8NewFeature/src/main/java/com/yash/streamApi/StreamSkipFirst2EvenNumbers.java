package com.yash.streamApi;
import java.util.stream.Stream;
 
public class StreamSkipFirst2EvenNumbers {
 
    public static void main(String[] args) {
 
        System.out.println("List of integer after "
                + "skipping first 2 EVEN numbers :- \n");
 
        // skip first 2 numbers and print remaining
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(i -> i%2 == 0)
        .skip(2)
        .forEach(System.out::println);
    }
}