package com.syntax.class26_1;

public class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Open safari");
		
	}

	@Override
	public void close() {
		System.out.println("Close safari");
		
	}

	@Override
	public String getTitle() {
		System.out.println("return null");
		return null;
	}

	@Override
	public void getScreenshoy() {
		System.out.println("Screenshot safari");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigate safari");
		
	}

}
