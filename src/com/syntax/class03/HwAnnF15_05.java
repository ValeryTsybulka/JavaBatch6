package com.syntax.class03;

import java.util.Scanner;

public class HwAnnF15_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please entera number");

		int a = scan.nextInt();

		if (a % 2 == 0) {
			System.out.println("The number " + a + " is even.");
		} else {
			System.out.println("The number " + a + " is odd.");
		}

	}

}
