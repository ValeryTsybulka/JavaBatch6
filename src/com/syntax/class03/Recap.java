package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// widening, happens implicitly
				double d=10;
				System.out.println(d);// 10.0
				// int 1=10.99;--> compile time error saying;
				// type mismatch , cannot convert double to int
				// Casting in Java is a conversion of 1 type into another type 
				// 2 types of Casting;
				//1.) widening(impilict casting) automatically 
				// byte-> short-> int-> long-> float-> double
				//2.) narrowing (explicit casting, manually
				// double-float-long-int-short-byte
				// narrowing, explicitly implementing
				int i= (int)10.99;
				System.out.println(i);
				//byte -128 to 127
				byte b=(byte)12889;
				System.out.println(b);
                
	}

}
