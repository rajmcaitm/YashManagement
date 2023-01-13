package com.yash.interview;

import java.util.HashSet;
import java.util.Set;

class CommonCharFrmTwoString
{
	public static void main(String[] args) {
	    String first = "abcbcdzz";
	    String second = "cdefefzz";
	   String common = commonCharacters(first, second);
	   System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");
	    
	}
	
	public static String commonCharacters(String s1, String s2) {
	   
		String result ="";
		Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(char c : s1.toCharArray()) {
            set1.add(c);
        }
        for(char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Stores the intersection of set1 and set2 inside set1
        set1.retainAll(set2);

        for(char c : set1) {
        	result= result+c;
        }

        return result;
    }
}



