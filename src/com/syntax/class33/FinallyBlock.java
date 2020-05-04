package com.syntax.class33;

import java.io.FileInputStream;

public class FinallyBlock {

	public static void main(String[] args) {

		String file = System.getProperty("user.dir") + "/configs/configuration.properties";
		// String file="";
		try {
			FileInputStream fis = new FileInputStream(file);// new FileNotFoundException();
			System.out.println("I am a try block");
		} catch (Exception e) {
			System.out.println("I am a catch block");
		} finally {// always gets executed
			System.out.println("I am a finally block");
		}
	}
}
