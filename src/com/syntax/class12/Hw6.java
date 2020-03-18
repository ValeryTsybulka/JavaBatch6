package com.syntax.class12;

import java.util.Scanner;

public class Hw6 {
	public static void main(String[] args) {
		String str = "";
		String rev = "";
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str = scan.nextLine();
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      System.out.println(rev);
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}

}
