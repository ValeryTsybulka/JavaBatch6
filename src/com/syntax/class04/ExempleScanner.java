package com.syntax.class04;

import java.util.Scanner;

public class ExempleScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter text");
		String text = scan.nextLine();

		System.out.println(text);

		System.out.println("Enter number");
		int text1 = scan.nextInt();

		System.out.println(text1);
	}

}
