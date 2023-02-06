package com.yash.tech;

import java.util.TreeSet;

class TreeSet1 {
	public static void main(String args[]) {
		
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		al.forEach(test->System.err.println(test));
		
	}
}