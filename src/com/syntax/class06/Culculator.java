package com.syntax.class06;

import java.util.Scanner;

public class Culculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		double num1=scan.nextDouble();
		System.out.println("Please enter an arithmetic operation");
		char c=scan.next().charAt(0);
		System.out.println("Please enter second number");
		double num2=scan.nextDouble();
		
		double result=0;
		
		switch(c) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println(c+" is not an arithmetic operation");
			return;
		
		}
		System.out.println(num1+" "+c+" "+num2+" = "+result);
	
	
	}
}
