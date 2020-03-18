package com.syntax.class06;

import java.util.Scanner;

public class HwAnnF23_01 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String language;
		
		//switch(country.equalsIgnoreCase(country);
		//switch(country.toLowerCase();
		//switch(country.toUpperCase();
				
		switch(country)   {
		
		case "Belarus":
		language="Belarusian";
		break;
		
		case "Ukrain":
		language="Ukrainian";
		break;
		
		case "Rassia":
		language="Russian";
		break;
		default:
			language="unknown";
		}
		
		System.out.println("You speak "+language+" lenguage.");
		
	}

}
