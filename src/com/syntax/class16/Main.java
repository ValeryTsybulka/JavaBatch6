package com.syntax.class16;

import java.util.Scanner;

public class Main {

//	public static String upperCase(String a) {
//		return a.toUpperCase();
//	}
//
//	public static void main(String[] args) {
//		System.out.println();
//	}

	public static boolean num(int a, int b) {
		// boolean c;
		if (a % 2 == 0 && b % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(num(8, 6));
	}
}
