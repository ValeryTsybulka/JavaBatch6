package com.syntax.class22;

public class Test {
	public static void main(String[] args) {
		
	
int a=10;
int b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a+" b="+b);
String w1="First";
String w2="Second";
int z=w1.length();
w1=w1+w2;
w2=w1.substring(0, z);
w1=w1.substring(z);
System.out.println("w1="+w1);
System.out.println("w2="+w2);

	}
}
