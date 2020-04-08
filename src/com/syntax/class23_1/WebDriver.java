package com.syntax.class23_1;

public class WebDriver {

	void open() {
		System.out.println("Opening browser");
	}
}
 class Firefox extends WebDriver{
	void open() {
		System.out.println("Firefox browser");
	}	
}
 class Chrome extends WebDriver{
	void open() {
		System.out.println("Chrome browser");
	}
}
 class IE extends WebDriver{
	void open() {
		System.out.println("IE browser");
	}
}


