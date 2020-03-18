package com.syntax.class12;

import java.util.Scanner;

public class Hw3BabyName {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter father's name");
	String name1=scan.nextLine();
	System.out.println("Please enter mother's name");
	String name2=scan.nextLine();
	System.out.println("Boy or girl?");
	String sex=scan.nextLine();
	int length1=name1.length()/2;
	int length2=name2.length()/2;
		
	if(sex.equalsIgnoreCase("boy")) {
		System.out.println("Baby's is "+name1.substring(0, length1)+name2.substring(length2));
	}
	if(sex.equalsIgnoreCase("girl")) {
		System.out.println("Baby's name is "+name2.substring(0, length2)+name1.substring(length1));
	}
	
}
}
