package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Repl209 {
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);
	}
	
	public static void main(String[] args) {
		try {
			read("");
		} catch (FileNotFoundException e) {
		  	System.out.println(e);
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
	}
 

}
