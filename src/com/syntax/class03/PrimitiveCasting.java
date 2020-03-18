package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// widening, happens implicitly
		double d = 10;

		System.out.println(d);
		// int i=10.99 --> compile time error saying:
		// type mismatch, cannot convert double to int
		
		//narrowing, explicitly imlementing
		int a=(int)10.99;
		System.out.println(a);
		
		// byte -128 to 127
		
		byte b=(byte)1274;
		
		System.out.println(b);

	}

}
