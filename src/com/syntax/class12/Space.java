package com.syntax.class12;

public class Space {
	public static void main(String[] args) {
		String a = "Good Morning!! !!";

		String c = a.replaceAll(" ", "");

		String b = a.replaceAll("[^A-Za-z]", "");

		System.out.println(c);
		System.out.println(b.length());

		String d="Is it Saturday? Is it raining? Do we have a Java class today?";
		d=d.replaceAll("[^?]", "");
		System.out.println(d+" "+d.length());
	}
}
