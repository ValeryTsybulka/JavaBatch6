package com.syntax.class04;

import java.util.Scanner;

public class scaner1 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		
		System.out.println("My name is "+name);
	}

}
