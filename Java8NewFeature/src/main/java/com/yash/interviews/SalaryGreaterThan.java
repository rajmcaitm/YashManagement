package com.yash.interviews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryGreaterThan {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "A", 23, 444, "Bagalore", 1));
		empList.add(new Employee(2, "B", 22, 44, "Bagalore", 2));
		empList.add(new Employee(3, "C", 26, 444, "Bagalore", 3));
		empList.add(new Employee(4, "D", 28, 414, "Bagalore", 2));
		empList.add(new Employee(5, "S", 60, 474, "Bagalore", 1));
		empList.add(new Employee(6, "K", 12, 484, "Bagalore", 3));
		empList.add(new Employee(7, "E", 44, 444, "Bagalore", 2));

		//System.out.println(getEmployeeSalary(empList).toString());
		for(Employee ee: getEmployeeSalary(empList)) {
			
			System.out.println(ee.getEmpSalary());
			
		}
		
		

	}

	private static List<Employee> getEmployeeSalary(List<Employee> list) {

		List<Employee> empList = list

				.stream()
				.filter(sal -> sal.getEmpSalary() > 444)
				.sorted(Comparator.comparing(Employee::getEmpSalary).reversed())
				.collect(Collectors.toList());

		return empList;
	}
}
