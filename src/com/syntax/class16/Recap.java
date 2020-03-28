package com.syntax.class16;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("In:");
		String a=scan.nextLine();
		
		String b=a.replaceAll("[^A-Za-z]", "");
		int lengthB=b.length();
		String[] c=a.split(" ");
		int numC=c.length;
		System.out.println(a);
		System.out.println(b);
		System.out.println(lengthB);
		for(String z:c)
		System.out.print(z+"+");
		System.out.println(" "+numC);
	}
}
