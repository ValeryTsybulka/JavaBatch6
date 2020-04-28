package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Justdo1 {
public static void main(String[] args) throws IOException {
	
	String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics"
			+ "\\configs\\browser.properties";
	FileOutputStream fos=new FileOutputStream(filePath);
	Properties prop=new Properties();
	prop.setProperty("userName", "Victor");
	prop.store(fos, "userName");
	
	
	
	
}
}
