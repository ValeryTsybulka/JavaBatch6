package com.syntax.class12;

import java.util.Scanner;

public class Hw2 {
	 public static void main(String[] args) {
	        boolean isPrime = true;
	        int num;
	        int num1;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter any number");
	        num = scan.nextInt();
	        scan.close();
	        for (int a = 2; a <= num / 2; a++) {
	            num1 = num % a;
	            if (num1 == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) {
	            System.out.println("Number " + num + " is a prime");
	        } else {
	            System.out.println("Number " + num + " is not a prime");
	        }
	    }

}
