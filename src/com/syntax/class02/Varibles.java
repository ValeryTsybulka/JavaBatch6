package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Varibles {

	public static void main(String[] args) throws FileNotFoundException  {
		
	String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs"
			+ "\\Url.properties";
	
	//System.out.println("----");
	
	FileInputStream fileInput=new FileInputStream(filePath);
	}

}
