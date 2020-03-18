package com.syntax.class04;

import java.util.Scanner;

public class HwAnnF16_03 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What amout of loan you need");
		
		int loan=scan.nextInt();
		
		if(loan<200_000) {
			System.out.println("I'll lend you money!");
		}else {
			System.out.println("Sorry, I can not lend you money");
		}
		
	}

}
