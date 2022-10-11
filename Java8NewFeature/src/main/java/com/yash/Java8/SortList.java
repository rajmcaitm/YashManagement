package com.yash.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	
	static List<String> sortList(List<String> list) {
		
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		return sortedList;
		
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Laxman");
		list.add("Sita");
		list.add("Bharat");
		list.add("Ram");
		System.out.println(sortList(list));
	}

}
