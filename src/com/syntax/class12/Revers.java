package com.syntax.class12;

public class Revers {
public static void main(String[] args) {
	String day="Sunday";
	String rev="";
	for(int i=day.length()-1; i>=0; i--) {
		rev=rev+day.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(day)) {
		System.out.println("Word "+day+" is palindrome");
	}else {
		System.out.println("Word "+day+" is not palindrome");
	}
}
}
