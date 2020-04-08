package com.syntax.class23_1;

public class Main {
public static void main(String[] args) {
	WebDriver[] nn= {new Firefox(),new Chrome(),new IE()};
	for(WebDriver a:nn) {
		a.open();
	}
	
}
}
