package com.syntax.class26;

public class Circle implements Shape {

	@Override
	public double calculateArea(int r) {
		double area=PI*r*r;
		return area;
	}

	@Override
	public double calculatePerimetr(int r) {
		double perimetr=2*PI*r;
		return perimetr;
	}

}
