package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
 
public class StreamSkipMethod {
 
    public static void main(String[] args) {
 
        // list of integer numbers
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7
                );
 
        System.out.println("List of integers after "
                + "skipping first 2 numbers :- \n");
 
        // skip first 2 numbers and print remaining
        numbers
        .stream()
        .skip(2)
        .forEach(System.out::println);
    }
}