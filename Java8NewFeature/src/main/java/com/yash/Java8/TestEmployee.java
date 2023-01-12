package com.yash.Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		HashMap<String, List<Employee>> empMap = new LinkedHashMap<>();
		
		ArrayList<Employee> employeeList1 = new ArrayList<Employee>();
        employeeList1.add(new Employee(1001, "AA", 9985133, "channai", 4500));
        employeeList1.add(new Employee(1002, "AA",9985133, "channai", 1300));
        employeeList1.add(new Employee(1004, "AA",9985133, "channai", 1300));
        employeeList1.add(new Employee(1006, "AA",9985133, "channai", 1300));
        employeeList1.add(new Employee(1002, "AA",9985133, "channai", 1200));
        employeeList1.add(new Employee(1002, "AA",9985133, "channai", 1500));
        employeeList1.add(new Employee(1002, "AA",9985133, "channai", 1100));

        ArrayList<Employee> employeeList2 = new ArrayList<Employee>();
        employeeList2.add(new Employee(2004, "BB",9985133, "BANGALORE", 4521));
        employeeList2.add(new Employee(2006, "BB",9985133, "BANGALORE", 6532));
        employeeList2.add(new Employee(2005, "BB",9985133, "BANGALORE", 9884));
        employeeList2.add(new Employee(2007, "BB",9985133, "BANGALORE", 9975));
        employeeList2.add(new Employee(2004, "BB",9985133, "BANGALORE", 9576));

        ArrayList<Employee> employeeList3 = new ArrayList<Employee>();
        employeeList3.add(new Employee(3007, "CC",9985133, "HYDERABAD", 2015));
        employeeList3.add(new Employee(3009, "CC",9985133, "HYDERABAD", 6987));
        employeeList3.add(new Employee(3010, "CC",9985133, "HYDERABAD", 1567));
        employeeList3.add(new Employee(3010, "CC",9985133, "HYDERABAD", 1897));

        empMap.put("CHANNAI", employeeList1);
        empMap.put("BANGALORE", employeeList2);
        empMap.put("HYDERABAD", employeeList3);
        Set<String> keySet = empMap.keySet();
        List<String> list = new ArrayList<>(keySet);
        
        Map<String, List<Employee>> resultMap = empMap.entrySet().stream()
        		.filter(map->map.getKey().equals(list.get(0)))
        		.collect(Collectors.toMap(test->test.getKey(), test->test.getValue()));
        
        resultMap.entrySet().stream().forEach(key -> System.out.println(key.getKey()+" : "+key.getValue()));
        
	}

}
