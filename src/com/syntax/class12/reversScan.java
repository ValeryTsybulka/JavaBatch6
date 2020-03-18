package com.syntax.class12;

import java.util.Scanner;

public class reversScan {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		
		for(int i=word.length()-1; i>=0; i--) {
			char rewWord=word.charAt(i);
			System.out.print(rewWord);
		}

	}
}
