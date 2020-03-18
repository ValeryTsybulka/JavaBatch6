package com.syntax.class05;

import java.util.Scanner;

public class HwAnnF22_02 {
	public static void main(String[] args) {
		
		int day;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Enter a day number");
		
		day=scan.nextInt();
		if(day>=1 && day<6)
			System.out.println("It's a weekday");
		else if(day==6 || day==7)
			System.out.println("It's a weekend");
		else
		System.out.println("Invalid day");
		
	}

}
