package com.yash.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEmpWhoseNameStartFrmD {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "ram", 23, 444, "Bagalore", 1));
		empList.add(new Employee(2, "mohan", 22, 44, "Bagalore", 2));
		empList.add(new Employee(3, "sohan", 26, 444, "Bagalore", 3));
		empList.add(new Employee(4, "dharm", 28, 414, "Bagalore", 2));
		empList.add(new Employee(5, "dhariya", 60, 474, "Bagalore", 1));
		empList.add(new Employee(6, "patel", 12, 484, "Bagalore", 3));
		empList.add(new Employee(7, "mah", 44, 444, "Bagalore", 2));

		List<String> empListName = nameStartFromD(empList);

		empListName.forEach(empName -> System.out.println(empName));

	}

	public static List<String> nameStartFromD(List<Employee> empList) {

		List<String> empName = empList
				.stream()
				.map(Employee::getEmpName)
				.filter(names -> names
						.startsWith("d"))
				.collect(Collectors.toList());

		return empName;

	}

}
