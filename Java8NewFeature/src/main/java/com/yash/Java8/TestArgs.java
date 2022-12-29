package com.yash.Java8;

public class TestArgs {

	public static void main(String...args) throws InterruptedException {
		
		args = new String[5];
		for (int i = 0; i < args.length; i++) {
			args[i] = "khalilabad";
			Thread.sleep(5000);
			System.out.println(args[i]);
		}
		

	}

}
