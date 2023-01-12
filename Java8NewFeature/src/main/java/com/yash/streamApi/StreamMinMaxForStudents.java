package com.yash.streamApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class StreamMinMaxForStudents {
 
    public static void main(String[] args) {
 
        
        List<Student> students = Arrays.asList(
                new Student(1, "Viraj", 17),
                new Student(2, "Krishnanand", 18),
                new Student(3, "Rishi", 16),
                new Student(4, "Suresh", 23),
                new Student(5, "Aditya", 21)
                );
 
        
        Student studentWithMinAge = students
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();
 
        System.out.println("Student with minimum age is = "
                + studentWithMinAge);
 
        
        Student studentWithMaxAge = students
                .stream()
                .max(Comparator.comparing(Student::getAge))
                .get();
 
        System.out.println("\n Student with maximum age is = "
                + studentWithMaxAge);
    }
}