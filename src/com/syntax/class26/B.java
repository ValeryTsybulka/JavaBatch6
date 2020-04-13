package com.syntax.class26;

public class B extends Marks{
int d;
	B(int a, int b, int c, int d) {
		super(a, b, c);
		this.d=d;
	}

	@Override
	double getPercentage() {
		System.out.println("Average of 4 subjects = "+(a+b+c+d)/4);
		return (a+b+c+d)/4;
	}

}
