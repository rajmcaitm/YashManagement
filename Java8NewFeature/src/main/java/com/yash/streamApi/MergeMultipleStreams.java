package com.yash.streamApi;
import java.util.stream.Stream;
import static java.util.stream.Stream.concat;
 
public class MergeMultipleStreams {
 
    public static void main(String[] args) {
 
        // Stream 1
        Stream<Integer> stream1 = Stream.of(1,2,3);
 
        // Stream 2
        Stream<Integer> stream2 = Stream.of(1,4,5);
 
        // Stream 3
        Stream<Integer> stream3 = Stream.of(2,6,7);
 
        // Stream 4
        Stream<Integer> stream4 = Stream.of(3,8,9);
 
        // Merge multiple streams using Stream.concat()
        Stream<Integer> resultStream = Stream
                .concat(stream1, 
                        concat(stream2, 
                                concat(stream3, stream4)));
 
        // print to console
        System.out.println("Multiple Merged Streams elements :- \n");
        resultStream.forEach(num -> System.out.println(num));
    }
}