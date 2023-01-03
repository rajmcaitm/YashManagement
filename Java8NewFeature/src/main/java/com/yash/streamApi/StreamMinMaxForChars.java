package com.yash.streamApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class StreamMinMaxForChars {
 
    public static void main(String[] args) {
 
        // list of characters
        List<Character> chars = Arrays.asList(
                'a', 'b', 'c', 
                'd', 'e', 'f', 
                'g', 'h', 'i'
                );
 
        // get minimum char from list of characters
        char minChar = chars.stream().min(Comparator.comparing(Character::charValue)).get();
                
 
        System.out.println("Minimum char is = "
                + minChar);
 
        // get maximum char from list of characters
        char maxChar = chars.stream().max(Comparator.comparing(Character::charValue)).get();
                
 
        System.out.println("Maximum char is = "
                + maxChar);
    }
}