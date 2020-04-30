package com.syntax.class31;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class FileReading {
	public static void main(String[] args) throws IOException {

		String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs"
				+ "\\ConfigurationProperties";
		System.out.println("1 "+filePath);

		String userDirectory=System.getProperty("user.dir");
		System.out.println("2 "+userDirectory);

		String username=System.getProperty("user.name");
		System.out.println("3 "+username);

		String os=System.getProperty("os.name");
		System.out.println("4 "+os);

		String filePath1=System.getProperty("user.dir")+"\\configs\\ConfigurationProperties";
		FileInputStream fis=new FileInputStream(filePath);

		Properties prop=new Properties();
		prop.load(fis);

		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");

		System.out.println(browser);
		System.out.println(url);
		System.out.println(prop.get("url"));
	}
}
