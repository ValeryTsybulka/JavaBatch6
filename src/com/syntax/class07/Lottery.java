package com.syntax.class07;

import java.util.Scanner;

public class Lottery {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int num=17;
    int num1=0;
    int num2=0;
	while(num1!=num) {
	System.out.println("Please enter  number from 1 to 20");
	 num1=scan.nextInt();
	}
	System.out.println("Congrats1");
	
	do {      
		System.out.println("Please enter number from 1 to 2");
		num2=scan.nextInt();
	}while (num2!=num);
	System.out.println("Congrats2");
}
	
}
