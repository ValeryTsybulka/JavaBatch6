package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hw {

	public static void main(String[] args) throws IOException {
		
String filePath=System.getProperty("user.dir")+"\\configs\\Url.properties";
System.out.println(filePath);

FileInputStream fis=new FileInputStream(filePath);

Properties prop=new Properties();
prop.load(fis);


	}
}
