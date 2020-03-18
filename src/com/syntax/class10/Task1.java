package com.syntax.class10;

public class Task1 {
public static void main(String[] args) {
	String[] a= {"Lion","Tiger", "Giraffe","Goat","Pig","Volf"};
	
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("***************************");
	
	for(String b:a) {
		System.out.print(b+" ");
	}
	
}
}
