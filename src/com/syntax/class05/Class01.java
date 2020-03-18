package com.syntax.class05;

import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");

		int a = scan.nextInt();

		if (a >= 1 && a < 10)
			System.out.println("The number is small");
		else if (a > 10 && a <= 100)
			System.out.println("The number is big");
		else if (a > 100 && a <= 1000)
			System.out.println("The number is large");
		else
			System.out.println("The number is super large");

		System.out.println("_____________________________________________________________________");

		System.out.println("Enter another  number");
		int b = scan.nextInt();

		if (b == 2 || b == 3)
			System.out.println("Today is SDLC class");
		else if (b == 6 || b == 7)
			System.out.println("Today is Java class");
		else if (b == 4)
			System.out.println("Today is review class with Elion");
		else if (b == 1 || b == 5)
			System.out.println("N0 classes today");
		else
			System.out.println("Invalid number");

		System.out.println("---------------using Strings------------------------------------------");

		System.out.println("Enter a day");

		String c = scan.nextLine();

		if (c.equals("Tuesday") || c.equals("Wednesday"))
			System.out.println("Today is SDLC class");
		else if (c.equals("Suturnday") || c.equals("Sunday"))
			System.out.println("Today is Java class");
		else if (c.equals("Thusday"))
			System.out.println("Today is review class with Elion");
		else if (c.equals("Monday") || c.equals("Friday"))
			System.out.println("N0 classes today");
		else
			System.out.println("Wrong enter");

	}

}
