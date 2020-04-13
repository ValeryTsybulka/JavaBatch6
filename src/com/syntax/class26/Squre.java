package com.syntax.class26;

public class Squre implements Shape{

	@Override
	public double calculateArea(int a) {
		double area=a*2;
		return area;
	}

	@Override
	public double calculatePerimetr(int a) {
		double perimeter=4*a;
		return perimeter;
	}
	

}
