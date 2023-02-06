package com.yash.interviews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSorting {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", 23, 444, "blr", 1));
		list.add(new Employee(1, "A", 23, 444, "blr", 2));
		list.add(new Employee(1, "A", 23, 444, "blr", 5));
		list.add(new Employee(1, "A", 23, 444, "blr", 3));

		List<Employee> empList = sortEmpObject(list);
		empList.forEach(test -> System.out.println(test));

	}

	public static List<Employee> sortEmpObject(List<Employee> list) {

		List<Employee> empList = list.stream().sorted(Comparator.comparing(Employee::getEmpDesignation).reversed())
				.collect(Collectors.toList());

		return empList;

	}

}


