package com.syntax.class04;

import java.util.Scanner;

public class HwRepl_0032 {

	public static void main(String[] args) {
		

		Scanner scan2 = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = scan2.nextInt();

		System.out.println("Please enter your gender: M or F");
		String gender = scan2.next();

		if (age >= 25)

			if (gender.equals("M"))
				System.out.println("Man");
			else if (gender.equals("F"))
				System.out.println("Woman");
			else
				System.out.println("Wrong Enter");

		else

		if (gender.equals("M"))
			System.out.println("Boy");
		else if (gender.equals("F"))
			System.out.println("Girl");
		else
			System.out.println("Wrong Enter");

	}

}