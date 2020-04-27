package com.syntax.class31;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.Properties;
		import java.util.Set;

		public class ReadFile{
			public static void main(String[] args) throws IOException {
				
				String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs\\browser.properties";
				String userDir=System.getProperty("user.dir");
				System.out.println(userDir);
				
//				String filePath1=userDir+"\\configs\\browser.properties";
//				System.out.println(filePath1);
				//bring object of FileInputStream
				FileInputStream fileInput=new FileInputStream(filePath);
				
				// to handle data from .properties file we need Property class
				Properties prop=new Properties();
				prop.load(fileInput);
				
				String browser=prop.getProperty("browser");
				System.out.println(browser);
				
				String url=prop.getProperty("url");
				System.out.println(url);
				
				String url1=prop.getProperty("userName");
				System.out.println(url1);
				
				String url2=prop.getProperty("password");
				System.out.println(url2);
	}

}
