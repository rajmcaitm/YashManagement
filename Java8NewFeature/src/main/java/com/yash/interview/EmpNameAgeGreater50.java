package com.yash.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.collector.Student;

public class EmpNameAgeGreater50 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "A", 51));
		empList.add(new Employee(101, "B", 52));
		empList.add(new Employee(101, "C", 53));
		empList.add(new Employee(101, "D", 54));
		empList.add(new Employee(101, "E", 55));
		empList.add(new Employee(101, "F", 49));
		empList.add(new Employee(101, "G", 20));
		empList.add(new Employee(101, "H", 22));
		empList.add(new Employee(101, "I", 44));

		System.out.println(printNameWhoseAgeGreaterThenList50(empList));

	}

	public static List<String> printNameWhoseAgeGreaterThenList50(List<Employee> empList) {

		List<String> resultList = empList
				.stream()
				.filter(list->list.getAge() > 50)
				.collect(Collectors::toString);
				
		
		empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
		
		
		
		return resultList;

	}

}
