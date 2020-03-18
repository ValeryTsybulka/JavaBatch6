package com.syntax.class07;

public class HwAnnF29_01 {
public static void main(String[] args) {
	int i=1; 
	String s=" ";
	while(i<=100) {
		System.out.print(i+s);
		i++;
	}
	System.out.println(" ");
System.out.println("______________________________________________________________________________");

int i1=1;
	do {
		System.out.print(i1+s); i1++;
	}while(i1<=100);
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	int a=100;
	while(a>=1) {
		System.out.print(a+s); a--;
	}
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	int b=2;
	while(b<=20) {
		System.out.print(b+s);b+=2;
	}
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	int b1=1;
	while(b1<=20) {
		if(b1%2==0){  System.out.print(b1+s); }b1++; 
	}
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	for(int b2=1; b2<=20; b2++) {
		System.out.print(b2+s);
	}
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	for(int c=21; c<=50; c+=2) {
		System.out.print(c+s);
	}
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	int c1=21;
	do { System.out.print(c1+s); c1+=2;
	}while(c1<=50);
	System.out.println(" ");
	System.out.println("______________________________________________________________________________");
	
	int i2=20;
	while(i2<=50) {
		if(i2%2!=0) {System.out.print(i2+s);}i2++;
		
	}
	
	
	
}
}
