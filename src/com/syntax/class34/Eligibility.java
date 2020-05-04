package com.syntax.class34;

public class Eligibility {
	public static void main(String[] args) {

//		ages(20);
//		ages(14);
		names("Victor");
		names("John");
		names("Victorija");
	}

//	public static void ages(int age) {
//		if (age > 16) {
//			System.out.println("You can get DR");
//		} else {
//			throw new RuntimeException("Too young for DR");
//		}
//	}

	public static void names(String name) {
		int num = name.length();
		if (num >= 5) {
			System.out.println("Hi " + name);
		} else {
			throw new RuntimeException("Your name " + name + " is too short to Hi");
		}
	}

}