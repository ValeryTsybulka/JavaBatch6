package com.syntax.class17;

public class StaticKeyWord {
	String color;
	int memory;
	static String brand;
	static boolean touchScreen;
	
	static void info() {
		System.out.println("We are building "+brand+" with "+touchScreen);
	}
   void display() {
	   System.out.println("We build "+brand+" with "+touchScreen);
   }
   
}
