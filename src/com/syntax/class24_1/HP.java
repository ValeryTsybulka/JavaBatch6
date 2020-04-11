package com.syntax.class24_1;

public class HP extends Computer{
String name;
	HP(String color, String name) {
		super(color);
		this.name=name;
		}
	void print1() {
		System.out.println("I want "+color+name);
	}
	@Override
	void print2() {
		System.out.println("Afordeble");
		
	}

}
