package com.yash.Java8;

import java.util.TreeSet;

public class FarthestFromZero {

	public static void main(String[] args) {
        int [] arr = {-10, -11, 1, 2, 10, 0, 12};

        TreeSet<Integer> tSet = new TreeSet<>();
       for (int value : arr) {
		tSet.add(value);
	}
        int minValue = tSet.first();
        int maxValue = tSet.last();
        
        if(Math.abs(minValue) >= Math.abs(maxValue)) {
        	System.out.println(minValue);
        }else {
			System.out.println(maxValue);
		}
    }
}

/*
 * SELECT c.name AS Child, MAX(CASE WHEN p.gender = 'F' THEN p.name END) AS
 * Mother, MAX(CASE WHEN p.gender = 'M' THEN p.name END) AS Father FROM relation
 * r INNER JOIN people c ON c.id = r.cid INNER JOIN people p ON p.id = r.pid
 * GROUP BY c.name;
 */