package com.syntax.class25;

public interface WebDriver {
	
	void openBrowser();
	void findElement();
	void closeBrowser();
}  
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("");
		
	}

	@Override
	public void findElement() {
		System.out.println("");
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
}
class ChrmeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
}
//public class TestWebDriver {
//	public static void main(String[] args) {
//		 ChromeDriver chrome=new ChromeDriver();
//		 chrome.openBrowser();
//		 chrome.closeBrowser();
//		 chrome.maximaizeWindow();
//		 chrome.findElement();
//	}
//}


