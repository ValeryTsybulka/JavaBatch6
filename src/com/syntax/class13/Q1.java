package com.syntax.class13;

public class Q1 {
	public static void main(String[] args) {

        int num1=10, num2=20;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);

		String word1="First", word2="Second";
		int w1 = word1.length();
        word1 = word1 + word2;

		word2 = word1.substring(0, w1);
		word1 = word1.substring(w1);

		System.out.println("Word1 = " + word1);
		System.out.println("Word2 = " + word2);

	}

}
