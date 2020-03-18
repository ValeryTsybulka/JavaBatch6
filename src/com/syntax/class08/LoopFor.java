package com.syntax.class08;

public class LoopFor {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		
		for (int a = 1; a <= 99; a++) {
			if(a%2!=0) {
			sum = sum + a;
			
		}else {
			sum1=sum1+a;
			
		}
			
		}
		System.out.println("Summa  odd numbers =" + sum);
		System.out.println("Summa  even numbers =" + sum1);
		
		
		
//		for (int a1 = 1; a1 <= 99; a1++) {
//			sum1 = sum1 + 2;
//		}
//					
		
		}		
	
}
