package com.syntax.class05;

import java.util.Scanner;

public class Class02 {
	public static void main(String[] args) {
		// to import we use cntr+shift+o
		int age;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();
		
		if(age>0) {

		if (age < 3)
			System.out.println("You are a baby");
		else if (age > 3 && age < 6)
			System.out.println("You are a kid");
		else if (age >= 6 && age < 12)
			System.out.println("You are a child");
		else if (age >= 12 && age < 19)
			System.out.println("You are a teenager");
		else if (age >= 19 && age < 67)
			System.out.println("You are a odult");
		else
			System.out.println("Enjoy your life, senior!");
		}else
		System.out.println("Invalid number");
	}

}
