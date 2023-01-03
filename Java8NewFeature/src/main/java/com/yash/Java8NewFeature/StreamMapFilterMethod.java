package com.yash.Java8NewFeature;
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
class Student {
 
    // member variables
    String name;
    double percentage;
    String department;
 
    // public parameterized constructor
    public Student(String name, double percentage, String department) {
        super();
        this.name = name;
        this.percentage = percentage;
        this.department = department;
    }
 
    // getter and setter
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPercentage() {
        return percentage;
    }
 
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
}
 
public class StreamMapFilterMethod {
 
    public static void main(String[] args) {
 
        System.out.println("First class Student percentage : \n");
 
        List<Student> studentList = Arrays.asList(
                new Student("Vanita", 62, "Arts"),
                new Student("Rajesh", 55, "Commerce"),
                new Student("Naresh", 73, "Science"),
                new Student("Shiva", 64, "Arts"),
                new Student("Dinesh", 72, "Science"),
                new Student("Suresh", 50, "Commerce"),
                new Student("Radhika", 61, "Science")
                );
 
        // map and distinct
        List<Double> newList = studentList
                .stream() // 1. get stream
                .map(s -> s.getPercentage())// 2.1 get percentage
                .filter(p -> p > 60) // 2.2 filter first class student
                .collect(Collectors.toList());
 
        // print to console
        newList.forEach(System.out::println);
    }
}