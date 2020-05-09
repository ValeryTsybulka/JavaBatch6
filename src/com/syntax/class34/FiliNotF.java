package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FiliNotF {

	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);
	}
	
	public static void main(String[] args) {
		try {
			read("");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}
	
}
