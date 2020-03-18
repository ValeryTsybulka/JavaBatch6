package com.syntax.class06;

import java.util.Scanner;

public class HwAnnF23_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
		//char a=scan.next().charAt(0);
		String exp = "Non acceptable";
		
		switch (grade) {

		case 'A':
			exp = "Exelent";
			break;
		case 'B':
			exp = "Good";
			break;
		case 'C':
			exp = "Average";
			break;
		case 'D':
			exp = "Bad";
			break;

		// default:
		// grade="Non acceptable";

		}
		System.out.println("Your grade " + grade + " is " + exp);

	}

}
