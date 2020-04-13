package com.syntax.class26;

public class webTest {
public static void main(String[] args) {
	WebDriver[] nn= {new ChromeDriver(), new FirefoxDriver()};
	//FirefoxDriver nn1=new FirefoxDriver();
	for (WebDriver p:nn) {
		p.findElement();
		p.openBrowse();
		
		p.maximizeWindow();
		p.closeBrowser();
		System.out.println("***********************");
	}
	
}
}
