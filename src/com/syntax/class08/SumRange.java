package com.syntax.class08;

import java.util.Scanner;

public class SumRange {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("Please enter first number");
		int i1 = scan.nextInt();
		System.out.println("Please enter first number");
		int i2 = scan.nextInt();

		for (int i = i1; i <= i2; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println("Sum odd numbers =" + sum2);
		System.out.println("Sum even numbers =" + sum1);
	}
}
