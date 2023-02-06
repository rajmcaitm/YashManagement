package com.yash.tech;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.yash.interviews.Employee;

class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getEmpId()-o1.getEmpId();
	}
	
}

class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getEmpName().compareTo(o1.getEmpName());
	}
	
}




public class SortEmployeeObject {
	
	public static void main(String[] args) {
		
		Set<Employee> empSet1 = new TreeSet<>(new EmpIdComparator());
		Set<Employee> empSet2 = new TreeSet<>(new EmpNameComparator());
		empSet1.add(new Employee(1, "A", 23, 444, "blr", 1));
		empSet1.add(new Employee(4, "C", 23, 444, "blr", 2));
		empSet1.add(new Employee(2, "B", 23, 444, "blr", 5));
		empSet1.add(new Employee(3, "D", 23, 444, "blr", 3));
		
		
		empSet2.add(new Employee(1, "A", 23, 444, "blr", 1));
		empSet2.add(new Employee(4, "C", 23, 444, "blr", 2));
		empSet2.add(new Employee(2, "B", 23, 444, "blr", 5));
		empSet2.add(new Employee(3, "D", 23, 444, "blr", 3));
		
		
		empSet1.forEach(set->System.out.println(set));
		System.err.println("================================================================================");
		empSet2.forEach(set->System.err.println(set));
		
	}

}
