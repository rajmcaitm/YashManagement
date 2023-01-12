package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
 
public class StreamLimitMethod {
 
    public static void main(String[] args) {
 
        // list of integer numbers
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7
                );
 
        System.out.println("List of integer after "
                + "limiting to first 5 numbers :- \n");
 
        // limit first 5 numbers and print to console
        numbers
        .stream()
        .limit(5)
        .forEach(test->System.out.println(test));
}
}