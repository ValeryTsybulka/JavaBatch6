package com.syntax.class34;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TryCatchFinally {
	static String fPath = "";

	public static void division(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();// detailed message of an exception
			System.out.println(ae.getMessage());// message of an exception
		} finally {
			System.out.println("I am finally block");
		}}
		public static void read(String filePath) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {if(fis!=null) {
				fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
