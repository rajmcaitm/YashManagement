package com.yash.Java8NewFeature;
 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class ReverseSortingPrimitiveIntNumbers {
 
    public static void main(String[] args) {
 
        // 1. List - 10 numbers in random order
        List<Integer> numbers = Arrays.asList(
                35, 15, 10, 5, 50, 20, 45, 30, 25, 40
                );
 
        // pretty print numbers in random order
        System.out.println("1. Original List of"
                + " Integer numbers in Random order :\n");
        numbers.forEach(
                randomOrderNumber -> System.out.print(randomOrderNumber + "\t"));
 
 
        // 2. Ascending sorting using Stream.sorted() method
        List<Integer> sortedIntNumbers = numbers // original source elements
                .stream() // 2.1 get sequential stream
                .sorted(Comparator.naturalOrder()) // 2.2 sort acc. to natural order 
                .collect(Collectors.toList()); // 2.3 collect to new list after sorting
 
 
        // pretty printing to console
        System.out.println("\n\n\n2. Natural sorting - Ascending order : \n");
        sortedIntNumbers.forEach(
                ascendingOrderNumber -> System.out.print(ascendingOrderNumber + "\t"));
 
 
        // 3. Descending sorting using Stream.sorted() method
        List<Integer> reverseNumbers = numbers // original source elements
                .stream() // 3.1 get sequential stream
                .sorted(Comparator.reverseOrder()) // 3.2 reverse sorting
                .collect(Collectors.toList()); // 3.3 collect to new list after sorting
 
 
        // pretty printing to console
        System.out.println("\n\n\n3. Reverse sorting - Descending order : \n");
        reverseNumbers.forEach(
                descendingOrderNumber -> System.out.print(descendingOrderNumber + "\t"));
    }
}