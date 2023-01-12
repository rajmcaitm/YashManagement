package com.yash.collector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class SortArrayListOfStudentsUsingStreamSorted {
 
    public static void main(String[] args) {
 
        
        List<Student> students = new ArrayList<>();
 
 
        
        students.add(new Student(101, "Rambha", 46));
        students.add(new Student(102, "Amala", 57));
        students.add(new Student(103, "Urvashi", 49));
        students.add(new Student(104, "Meghana", 24));
        students.add(new Student(105, "Pavithra", 29));
        students.add(new Student(106, "Sneha", 38));
 
 
        
        System.out.println(" Original ArrayList "
                + "as per insertion-order :- \n");
        students.forEach(System.out::println);
 
 
       
        List<Student> sortedStudents = students
                .stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toList());
 
 
        
        System.out.println("\n Sorted Student ArrayList -"
                + " according to Age :- \n");
        sortedStudents.forEach(System.out::println);
 
 
        
        List<Student> reverseSortedStudents = students
                .stream()
                .sorted(Comparator.comparingInt(Student::getRollNumber).reversed())
                .collect(Collectors.toList());
 
        
        System.out.println("\n Reverse sorted Student ArrayList -"
                + " according to Id :- \n");
        reverseSortedStudents.forEach(System.out::println);
    }
}