package com.syntax.class26;

public class ChromeDriver implements WebDriver {

	@Override
	public void openBrowse() {
		System.out.println("Chrome open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Crome close");
		
	}

	@Override
	public void maximizeWindow() {
	System.out.println("Maximize Chrome");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Chrome");
		
	}
	

}
