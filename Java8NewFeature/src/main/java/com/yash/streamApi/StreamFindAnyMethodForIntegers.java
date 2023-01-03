package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class StreamFindAnyMethodForIntegers {
 
    public static void main(String[] args) {
 
        
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                );
 
       
        Optional<Integer> result1 = numbers 
                .stream() 
                .findAny(); 
 
        
        if(result1.isPresent()) {
 
            Integer firstNum = result1.get();
            System.out.println("1. Sequential findAny() result is = "
                    + firstNum);
        } 
        else {
            System.out.println("No value is pressnt");
        }
 
       
        numbers 
        .parallelStream() 
        .findAny() 
        .ifPresent(num -> 
        System.out.println("\n2. Parallel findAny() result is = "
                + num));
 
        
        Optional<Integer> result3 = numbers 
                .stream()
                .filter(num -> num % 2 == 0) 
                .findAny(); 
 
      
        result3.ifPresent(num -> 
        System.out.println("\n3. filter Even numbers & findAny() result is = "
                + num));
    }
}