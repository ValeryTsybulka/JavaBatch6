package com.syntax.class04;

import java.util.Scanner;

public class HwAnnF16_05 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What's that city? ");
		String city=scan.next();
		
		System.out.println("What's the temperature in Fahrenheit?");
		
		int temp=scan.nextInt();
		
		temp=(temp-32)*5/9;
		
		System.out.println("The temperature in the city "+city+" is "+temp);
		
		
	}

}
