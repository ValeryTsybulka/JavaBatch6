package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class JustDo {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs"
				+ "\\Examples.properties";
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		String lastName=prop.getProperty("lastName");
		System.out.println(lastName);
		String city=prop.getProperty("city");
		System.out.println(city);
		String country=prop.getProperty("country");
		System.out.println(country);
		Set<Object>key=prop.keySet();
		for(Object a:key) {
			System.out.print(a+" ");
		}
		
		
	}

}
