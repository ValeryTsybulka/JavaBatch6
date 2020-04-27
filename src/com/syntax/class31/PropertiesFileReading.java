package com.syntax.class31;
//shortcut for import for windows cntl+shift+o

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException {
		// read the file
		String filePath = "C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs" + "\\Examples.properties";

		// bring object of FileInputStream
		FileInputStream fileInput = new FileInputStream(filePath);

		// to handle data from .properties file we need Property class
		Properties prop = new Properties();
		prop.load(fileInput);

		String name = prop.getProperty("name");
		System.out.println(name);

		String city = prop.getProperty("city");
		System.out.println(city);

		String city1 = prop.getProperty("country");
		System.out.println(city1);

		// getting all keys from property file
		Set<Object> keys = prop.keySet();
		for (Object a : keys) {
			System.out.println(a);
		}

	}
}
