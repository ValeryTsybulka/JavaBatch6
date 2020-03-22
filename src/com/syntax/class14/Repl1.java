package com.syntax.class14;

import java.util.Scanner;

public class Repl1 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	   	String rev="";
	   	for(int i=givenString.length()-1; i>=0; i--){
	   	  rev=rev+givenString.charAt(i);
	   	}
	   	rev=rev.replace(" ", "");
	   	if(givenString.equalsIgnoreCase(rev)){
	   	  System.out.println("true");
	   	}else{System.out.println("false");}
	   	
	  }
}
