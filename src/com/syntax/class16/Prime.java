package com.syntax.class16;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("In:");
		int a = scan.nextInt();
		boolean flag = true;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The number is Prime");
		} else {
			System.out.println("The number is not prime");
		}

	}
}
