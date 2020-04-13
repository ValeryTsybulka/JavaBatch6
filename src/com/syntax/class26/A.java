package com.syntax.class26;

public class A extends Marks{

	A(int a, int b, int c) {
		super(a, b, c);
	}

	@Override
	double getPercentage() {
		System.out.println("Average of 3 subjects = "+(a+b+c)/3);
		return (a+b+c)/3;
	}

	
}
