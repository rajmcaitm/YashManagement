package com.yash.collector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentListByAge {
 
    // List of Students
    private static List<Student> getStudentList() {
 
        return Arrays.asList(
 
                new Student(2033, "Viraj", 29),
                new Student(2020, "Rishi", 25),
                new Student(2004, "Aditya", 33),
                new Student(2015, "Krish", 19),
                new Student(2037, "Suresh", 34)
                );
    }
 
    public static void main(String[] args) {
 
        
        List<Student> studentList = getStudentList();
 
 
        
        System.out.println("Student list as per Insertion-order :-\n");
        studentList.forEach(System.out::println); 
 
 
 
        
        System.out.println("\n\nSorted Student list by their Age :-\n");
 
 
        
        Collections.sort(
                studentList, 
                Comparator.comparingInt(Student::getAge) 
                );
 
 
        
        studentList.forEach(System.out::println); // iterate/printing
    }
}