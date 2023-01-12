package com.yash.interviews;

import java.io.FileReader;

public class FileReaderUsingFileReader {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\dharmraj.chaudhary\\Desktop\\Rough Work.txt");

		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);

		}

	}
}
