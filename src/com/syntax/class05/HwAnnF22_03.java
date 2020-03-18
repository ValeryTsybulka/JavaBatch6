package com.syntax.class05;

import java.util.Scanner;

public class HwAnnF22_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		int quiz = scan.nextInt();
		System.out.println("Please enter mid tern score");
		int midTerm = scan.nextInt();
		System.out.println("Please enter final score");
		int finalScore = scan.nextInt();

		double average = (quiz + midTerm + finalScore) / 3;
		String grade = "null";

		if (average < 0 || average > 100) {
			System.out.println("Wrong enter");
		} else {
			if (average >= 90)
				grade = "A";
			if (average >= 70 && average < 90)
				grade = "B";
			if (average >= 50 && average < 70)
				grade = "C";
			if (average < 50)
				grade = "F";

			System.out.println("Your grade is " + grade);

		}
	}

}
