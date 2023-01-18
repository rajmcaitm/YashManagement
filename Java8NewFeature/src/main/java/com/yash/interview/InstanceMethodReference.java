package com.yash.interview;

interface Talking {
	void say();
}

public class InstanceMethodReference {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {

		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

		Talking talk1 = instanceMethodReference::saySomething;
		talk1.say();

		Talking talk2 = new InstanceMethodReference()::saySomething;
		talk2.say();
	}
}