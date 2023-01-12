package com.yash.Java8NewFeature;

@FunctionalInterface
interface DemoInterfaces {
    public int add(int n1, int n2);
}
 
public class TestLambdaExpressions {
 
    // main method
    public static void main(String[] args) {
 
        // Lambda Expression equivalent for above method
        DemoInterfaces d = (n1, n2) -> n1+n2;
 
        // how to invoke Lambda Expression -> Functional Interface
        System.out.println(d.add(13, 17));
    }
}