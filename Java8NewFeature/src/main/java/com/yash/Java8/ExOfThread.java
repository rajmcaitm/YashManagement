package com.yash.Java8;

public class ExOfThread extends Thread {

	public void run() {
		System.out.println("Thread id running");
	}

	public static void main(String[] args) {
		ExOfThread thread = new ExOfThread();
		ExOfThread.yield();
		thread.start();

	}

}
