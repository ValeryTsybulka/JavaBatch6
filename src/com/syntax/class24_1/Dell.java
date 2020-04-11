package com.syntax.class24_1;

public class Dell extends Computer {
String name;
	Dell(String color, String name) {
		super(color);
		this.name=name;
		
	}
	void print1() {
		System.out.println("I want "+color+name);
	}
	@Override
	void print2() {
		System.out.println("Or free");
		
	}

}
