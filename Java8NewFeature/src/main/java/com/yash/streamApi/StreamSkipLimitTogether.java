package com.yash.streamApi;
import java.util.stream.Stream;
 
public class StreamSkipLimitTogether {
 
    public static void main(String[] args) {
 
        // skip & limit together
        Stream
        .iterate(1, i -> i + 2)
        .skip(5) // 
        .limit(10) 
        .forEach(num -> System.out.print(" " + num));
    }
}