package com.syntax.class09;

public class Test1 {
	public static void main(String[] args) {
//		for (int a = 0; a < 24; a++) {
//			for (int b = 0; b < 60; b++) {
//				
//				for(int c=0; c<10; c++) {
//					for(int d=0; d<10; d++) {	
//				if (b < 10) {
//					
//							System.out.print(a + ":" + "0" + b);
//							System.out.println(c + ":" + "0" + d);
//											
//				} else {
//					System.out.println(a + ":" + b);
//					System.out.println(c + ":" + d);
//				}
//			}
//		}
//	}
		
		for (int a=0; a<24; a++) {
			for (int b=0; b<60; b++) {
				if (a>=10 && b<10) {
					System.out.println(a+":0"+b);
				}else if (a<10 && b>=10) {
					System.out.println("0"+a+":"+b);
				}else if (b<10 && a<10) {
					System.out.println("0"+a+":0"+b);
				}else
				System.out.println (a+":"+b);
			}
		
		}}}
