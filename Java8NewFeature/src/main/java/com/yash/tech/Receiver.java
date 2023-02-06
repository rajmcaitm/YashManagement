package com.yash.tech;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Receiver {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		FileInputStream fis
			= new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		
		SerializedObject g1 = (SerializedObject)ois.readObject();

		
		System.out.println("Deserialized Object Value:"
						+ g1.i + "..." + g1.j);
	}
}
