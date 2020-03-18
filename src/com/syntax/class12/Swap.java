package com.syntax.class12;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter two numbers");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
   int num1=10, num2=20;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("a=" + num1);
		System.out.println("b=" + num2);

//		System.out.println("Please enter two word");
//		String word1 = scan.nextLine();
//		String word2 = scan.nextLine();
		String word1="First", word2="Second";
		
		int w1 = word1.length();
    
		word1 = word1 + word2;

		word2 = word1.substring(0, w1);
		word1 = word1.substring(w1);

		System.out.println("Word1 = " + word1);
		System.out.println("Word2 = " + word2);

	}
}
