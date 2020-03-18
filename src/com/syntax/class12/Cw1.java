package com.syntax.class12;

public class Cw1 {
public static void main(String[] args) {
	String day="Sunday";
//	char[] b=new char[6];
//	for(int i=0; i<day.length(); i++) {
//		 b[i]=day.charAt(i);
//			}
//	for(int j=5; j>=0; j--) {
//		System.out.print(b[j]);
//	}
//	
//	for(int i=5; i>=0; i--) {
//		char a=day.charAt(i);
//		System.out.print(a);
//	}
	for(int i=day.length()-1; i>=0; i--) {
		char a=day.charAt(i);
		System.out.print(a);
	}
	
}
}
