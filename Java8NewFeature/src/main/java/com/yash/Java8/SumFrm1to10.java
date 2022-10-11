package com.yash.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumFrm1to10 {
	
	
	private static int sumAll(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum  = sum + list.get(i);
		}
		
		return sum;
		
	}
	
	private static int sum(ArrayList<Integer> list) {
		int sum = list.stream().collect(Collectors.summingInt(Integer :: intValue));
		return sum;
	}
	
	private static int sumListEle(ArrayList<Integer> list) {
		
		int[] integers =  list.stream().mapToInt(t ->t).toArray();
		int sum = Arrays.stream(integers).sum();
		
		return sum;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(sum(list));
		System.out.println(sumAll(list));
		System.out.println(sumListEle(list));
	}

	
}