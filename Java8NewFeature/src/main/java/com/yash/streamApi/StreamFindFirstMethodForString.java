package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class StreamFindFirstMethodForString {
 
    public static void main(String[] args) {
 
       
        List<String> names = Arrays.asList(
                "Putin",
                "Biden",
                "Manmohan",
                "Modi",
                "Jack"
                );
 
       
        Optional<String> result1 = names
                .stream()
                .findFirst();
 
        
        result1.ifPresent(str -> System.out.println(
                "1. Sequential findFirst() String result is = "
                        + str));
 
        
        Optional<String> result2 = names
                .parallelStream() 
                .findFirst(); 
 
       
        result2.ifPresent(str -> System.out.println(
                "\n2. Parallel findFirst() String result is = "
                        + str));
 
        
        Optional<String> result3 = names 
                .stream()
                .filter(str->str.startsWith("M"))
                .findFirst();
        
        result3.ifPresent(str -> System.out.println(
                "\n3. filter name starting with 'M' & findFirst() result is = "
                        + str));
 
       
        Optional<String> result4 = names 
                .stream() 
                .filter(str -> str.startsWith("A")) 
                .findFirst(); 
 
       
        System.out.println("\n4. names starting with 'A' = " + result4);
    }
}