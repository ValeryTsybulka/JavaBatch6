package com.syntax.class08;

import java.util.Scanner;

public class Askking {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	for(int i=1; i<11; i++) {
		System.out.println("Please apply for credit card");
		String ask= scan.nextLine();
		if(ask.equals("Yes")){
			System.out.println("Congrats");
			break;
		}
		
	}
	
}
}
