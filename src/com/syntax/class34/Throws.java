package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	public static void main(String[] args)  {
		sleep1();
		try {
			read("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************************");
	}
	
	public static void read(String filePath) throws FileNotFoundException {
		
			FileInputStream fis = new FileInputStream(filePath);
		
	}

	public static void sleep() throws InterruptedException {

		Thread.sleep(2000);
	}

	public static void sleep1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
