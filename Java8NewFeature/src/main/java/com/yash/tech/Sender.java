package com.yash.tech;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedObject implements Serializable {

	private static final long SerialVersionUID = 10l;
	int i = 10;
	int j = 20;
}

class Sender {

	public static void main(String[] args) throws IOException {

		SerializedObject g = new SerializedObject();

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(g);
	}
}