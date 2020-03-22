package com.syntax.class15;

public class Google {

	void larger(int a, int b) {
		if (a > b) {
			System.out.println("Number " + a + " is larger then  " + b);
		} else {
			System.out.println("Number " + b + " is larger then  " + a);
		}
	}

	void odd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {

			System.out.println(a + " is odd");
		}
	}

	void poli(String a) {
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		if (a.equalsIgnoreCase(rev)) {
			System.out.println(a + " is polindrome");
		} else {
			System.out.println(a + " is not polindrome");
		}
	}
	

}
