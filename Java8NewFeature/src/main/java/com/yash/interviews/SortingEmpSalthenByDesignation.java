package com.yash.interviews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEmpSalthenByDesignation {

	public static void main(String[] args)  {
    	
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "A", 23, 444, "Bagalore", 1));
		empList.add(new Employee(2, "B", 22, 44, "Bagalore", 2));
		empList.add(new Employee(3, "C", 26, 444, "Bagalore", 3));
		empList.add(new Employee(4, "D", 28, 414, "Bagalore", 2));
		empList.add(new Employee(5, "S", 60, 474, "Bagalore", 1));
		empList.add(new Employee(6, "K", 12, 484, "Bagalore", 3));
		empList.add(new Employee(7, "E", 44, 444, "Bagalore", 2));

		List<Employee> testArrayList = printName(empList);

		for (int i = 0; i < testArrayList.size(); i++) {
			System.out.println(testArrayList.get(i));
		}

	}

	private static List<Employee> printName(ArrayList<Employee> empList) {

		List<Employee> resultList = empList
				.stream().sorted(Comparator.comparing(Employee::getEmpSalary)
						.reversed().thenComparing(Employee::getEmpDesignation).reversed())
				.collect(Collectors.toList());
	
		return resultList;

	}

}























































































