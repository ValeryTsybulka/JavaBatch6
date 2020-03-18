package com.syntax.class12;

import java.util.Scanner;

public class MiddleChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter aword");
		String word = scan.nextLine();

		if (!word.equals("")) {
			int a = word.length();
			if (a % 2 != 0 && a >= 3) {
				a = a / 2;
				char b = word.charAt(a);
				System.out.println(b);
			} else {
				System.out.println("The word has even number oh characters.");
			}
		} else
			System.out.println("String is empty.");
	}
}
