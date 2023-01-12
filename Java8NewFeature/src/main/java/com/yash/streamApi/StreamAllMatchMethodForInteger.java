package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
 
public class StreamAllMatchMethodForInteger {
 
    public static void main(String[] args) {
 
        // list of 10 natural numbers
        List<Integer> numbers = Arrays
                .asList(1,2,3,4,5,6,7,8,9,10);
 
        System.out.println("Original list of integers : " + numbers);
 
        // 1. predicate to check all number are positive ?
        boolean isPositive = numbers
                .stream()
                .allMatch(num -> num > 0);
 
        System.out.println("\n1. All numbers are positive = "
                + isPositive);
 
        // 2. predicate to check all number are greater than 10 ?
        boolean isGreaterThan10 = numbers
                .stream()
                .allMatch(num -> num > 10);
 
        System.out.println("\n2. All numbers are greater than 10 = "
                + isGreaterThan10);
 
        // 3. predicate to check all number are divisible by 2 ?
        boolean isDivisibleBy2 = numbers
                .stream()
                .allMatch(n-> n % 2 == 0);
 
        System.out.println("\n3. All numbers are divisible by 2 = "
                + isDivisibleBy2);
 
        // 4. predicate to check all number are divisible by 3 ?
        boolean isDivisibleBy3 = numbers
                .stream()
                .allMatch(n-> n % 3 == 0);
 
        System.out.println("\n4. All numbers are divisible by 3 = "
                + isDivisibleBy3);
    }
}