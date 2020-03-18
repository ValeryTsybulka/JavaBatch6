package com.syntax.class12;

public class Cw4 {
public static void main(String[] args) {
	String a="123abc!@#";
	a=a.replaceAll("[^A-Za-z]","");
	System.out.println(a);
	int b=a.length();
	System.out.println(b);
}
}
