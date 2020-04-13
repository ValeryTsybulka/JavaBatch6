package com.syntax.class26;

public class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowse() {
		System.out.println("FireFox open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFox close");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FireFox maximize");
		
	}

	@Override
	public void findElement() {
		System.out.println("FireFox find");
		
	}

}
