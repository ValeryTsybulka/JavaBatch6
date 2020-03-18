package com.syntax.class05;

import java.util.Scanner;

public class HwAnnF22_01 {
	public static void main(String[] args) {

		int hight;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your height");
		hight = scan.nextInt();
		if (hight > 0 && hight <= 60)
			System.out.println("You are short");
		else if (hight > 60 && hight <= 72)
			System.out.println("You are medium");
		else if(hight >72)
			System.out.println("You are tall");
		else
			System.out.println("Invalid enter");
	}

}
