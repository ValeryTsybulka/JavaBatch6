package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("INTERRAPT");
		}
		System.out.println("CONTINUE");
		String fPath = "";

		try {
			FileInputStream fis = new FileInputStream(fPath);
		} catch (FileNotFoundException fne) {
			System.out.println(fne.getMessage());
			System.out.println("NOTFOUND");
		}

	}
}
