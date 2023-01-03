package com.yash.streamApi;
import java.util.Arrays;
import java.util.stream.Stream;
 
public class StreamToArrayMethod {
 
    public static void main(String[] args) {
 
        //Stream of Integers
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
 
        //conversion of Stream to Object Array
        Object[] intArray = integerStream.toArray();
 
        //print to console
        System.out.println("Conversion of Stream of Integer"
                + " to Object[] Array :- \n"
                + Arrays.toString(intArray));
 
        //Stream of Strings
        Stream<String> stringStream = Stream.of(
                "Test", "ODI", "T20", 
                "IPL", "CPL", "BBL"
                );
 
        //conversion of Stream to Object Array
        Object[] strArray = stringStream.toArray();
 
        //print to console
        System.out.println("\nConversion of Stream of String"
                + " to Object[] Array :- \n"
                + Arrays.toString(strArray));
    }
}