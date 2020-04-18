package com.syntax.class26_2;

public class WrapperClasses {

	public static void main(String[] args) {
		Integer num=10;
		num.byteValue();
		num.doubleValue();
		String s=num.toString();
		
		System.out.println(num);
		System.out.println(num.byteValue());
		System.out.println(num.doubleValue());
		System.out.println(s);
		System.out.println(num.MIN_VALUE);
		Boolean bool=true; // autoboxing
		boolean b1=bool;   //autounboxing
		System.out.println(bool);
		System.out.println(b1);
	}
}
