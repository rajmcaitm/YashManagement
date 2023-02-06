package com.yash.tech;

public class SingletonClassEx {

	private static SingletonClassEx instance;

	private SingletonClassEx() {

	}

	public static SingletonClassEx getInstance() {
		if (instance == null) {
			synchronized (SingletonClassEx.class) {
				if (instance == null) {

					instance = new SingletonClassEx();
				}

			}
		}
		return instance;
	}
}
