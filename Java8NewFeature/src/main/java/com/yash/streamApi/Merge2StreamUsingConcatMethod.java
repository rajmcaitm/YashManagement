package com.yash.streamApi;
import java.util.stream.Stream;
 
public class Merge2StreamUsingConcatMethod {
 
    public static void main(String[] args) {
 
        // Stream 1
        Stream<Integer> stream1 = Stream.of(2,4,5,7,9);
 
        // Stream 2
        Stream<Integer> stream2 = Stream.of(1,3,6,8,10);
 
        // Merge 2 streams using Stream.concat()
        Stream<Integer> resultStream = Stream.concat(stream1, stream2);
 
        // print to console
        System.out.println("Merged Streams :- \n");
        resultStream.forEach(num -> System.out.println(num));
    }
}