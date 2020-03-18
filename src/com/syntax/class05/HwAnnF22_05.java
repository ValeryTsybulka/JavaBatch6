package com.syntax.class05;

import java.util.Scanner;

public class HwAnnF22_05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one");
		double num1 = scan.nextDouble();
		System.out.println("Enter number two");
		double num2 = scan.nextDouble();
		System.out.println("Enter number three");
		double num3 = scan.nextDouble();
		
		double largest=0;
        if(!(num1==num2 && num1==num3)) {
        	
		if (num1 > num2) {
		if (num1 > num3) {
				//System.out.println("The largest number is " + num1);
			largest=num1;
		} else {
				//System.out.println("The largest number is " + num3);
			largest=num3;
		}
		} else { if (num2 > num3) {			   
			//System.out.println("The largest number is " + num2);
			largest=num2;
		} else {
			   // System.out.println("The largest number is " + num3);
			largest=num3;
		}
		}System.out.println("The largest number is "+largest);

        } else {    System.out.println("Three numbers are equal");
	 
        }

}}
