package com.syntax.class12;

public class Split {
	public static void main(String[] args) {
		
	
	String a = "Good Morning!! !!";
	String[] w=a.split(" ");
	System.out.println(w[0]);
	System.out.println(w[1]);
	System.out.println(w[2]);
	System.out.println(w[2]);
	int a1=a.length();
	int a2=w.length;
	for(int i=0; i<w.length; i++) {
		
	System.out.print(w[i]+"+");
	
	}
	
	
	System.out.println(a);
}}
