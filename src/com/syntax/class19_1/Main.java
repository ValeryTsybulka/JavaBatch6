package com.syntax.class19_1;

//import com.syntax.class19.Main;

public class Main {
	public static String alphabetical(String str) {

		String newStr = "";
		newStr = newStr + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) > str.charAt(i - 1)) {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}

	// test case below (dont change):
	public static void main(String[] args) {

		System.out.println(alphabetical("hello")); // "hlo"
	}
}
