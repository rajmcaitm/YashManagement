package com.yash.Java8NewFeature;

 interface Java8Interface {

	
	void displayAbstractMethod(); // by default, this is public and abstract

	// default method with concrete implementation from Java 8
	 public default void displayDefaultMethod() {
			System.out.println("InterfaceInJava8 : default method impl inside Java Interface");
		} 
	
	 static void hello()
	    {
	        System.out.println("Hello, New Static Method Here");
	    }
}


 
 class TestJava8 implements Java8Interface {
 
    // similar to abstract method, we can override default method too
    @Override
    public void displayAbstractMethod() {
        System.out.println("TestJava8InterfaceImpl : Implementing abstract method in this class\n");
    }
 
    public static void main(String args[]){
 
        // creating an object
    	TestJava8 impl = new TestJava8();
 
        // invoking abstract method implementation in this class
        impl.displayAbstractMethod();
 
        // invoking default method from interface
        impl.displayDefaultMethod();
        
        // invoking static method from interface
        //TestJava8.hello();
    }
 }
