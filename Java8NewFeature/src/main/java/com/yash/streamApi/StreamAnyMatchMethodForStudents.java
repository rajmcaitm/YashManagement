package com.yash.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class StreamAnyMatchMethodForStudents {
 
    public static void main(String[] args) {
 
        // list of students
        List<Student> students = Arrays.asList(
                new Student(1, "Viraj", 17),
                new Student(2, "Krishnanand", 18),
                new Student(3, "Rishi", 16),
                new Student(4, "Suresh", 23),
                new Student(5, "Aditya", 21)
                );
 
        // predicate 1 - name starts with K
        Predicate<Student> p1 = stud -> stud.getName().startsWith("K");
 
        // predicate 2 - age older than 22
        Predicate<Student> p2 = stud -> stud.getAge() > 22;
 
        // combined predicate - p1 && p2
        Predicate<Student> p3 = p1.and(p2);
 
        // print all Students to console
        System.out.println("List of Students :-");
        students.stream().forEach(student -> System.out.println(student));
 
        // 1. find whether any Student name starts with 'K'
        boolean boolP1 = students.stream().anyMatch(p1);
        System.out.println("\n1. Whether Student whose name starts"
                + " with 'K' present ? " + boolP1);
 
        // 2. find whether any Student name starts with 'K'
        boolean boolP2 = students.stream().anyMatch(p2);
        System.out.println("\n2. Student with Age greater"
                + " than 22 present ? " + boolP2);
 
        // 3. Student Name starts with 'K' && Age greater than 22
        boolean boolP3 = students.stream().anyMatch(p3);
        System.out.println("\n3. Student Name starts with 'K' and"
                + " Age greater than 22 present ? " + boolP3);
 
        // 4. in line multiple Predicate condition
        boolean boolP4 = students.stream().anyMatch(
                stud -> (stud.getName().startsWith("V") && stud.getAge() < 18));
        System.out.println("\n4. Student Name starts with 'V' "
                + "and Age greater than 18 present ? " + boolP4);
    }
}