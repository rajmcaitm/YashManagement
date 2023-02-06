package com.yash.tech;

import java.awt.image.SinglePixelPackedSampleModel;

class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstane() {
		if (instance == null) {

			instance = new Singleton();

		}
		return instance;
	}
}


public class TestSingleton {
	
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstane();
		Singleton obj2 = Singleton.getInstane();
		Singleton obj3 = Singleton.getInstane();
		Singleton obj4 = Singleton.getInstane();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
		if (obj1.hashCode() == obj2.hashCode() && obj3.hashCode() == obj4.hashCode()) {
			  
            
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
  
        else {
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
		
		
	}
	
	
}