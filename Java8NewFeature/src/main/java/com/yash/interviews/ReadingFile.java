package com.yash.interviews;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingFile {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\dharmraj.chaudhary\\Desktop\\Rough Work.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}

}
