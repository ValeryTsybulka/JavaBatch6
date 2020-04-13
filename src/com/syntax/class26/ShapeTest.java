package com.syntax.class26;

public class ShapeTest {
public static void main(String[] args) {
	Shape[] nn= {new Circle(), new Squre()};
	for(Shape pp : nn) {
		System.out.println("Area = "+pp.calculateArea(5));
		System.out.println("Perimeter = "+pp.calculatePerimetr(4));
	}
}
}
