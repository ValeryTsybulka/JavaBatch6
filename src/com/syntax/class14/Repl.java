package com.syntax.class14;

import java.util.Scanner;

public class Repl {
public static void main(String[] args) {
	String a="Hello Syntax friends";
     a=a.replace("Hello", "Welcome").replace("friends", "family");
     System.out.println(a);
     
     Scanner inp = new Scanner(System.in);
     System.out.print("In:");
     String s = inp.nextLine();
     //write your code below
     String rev="";
     for(int i=s.length()-1; i>=0; i--){
       rev=rev+s.charAt(i);
     }
     System.out.println(rev);
     System.out.print("In:");
     String givenString = inp.nextLine();
    	//write your code below
    	String rev1="";
    	for(int i=givenString.length()-1; i>=0; i--){
    	  rev=rev+givenString.charAt(i);
    	}
    	rev1=rev1.replace(" ","");
    	if(givenString.equalsIgnoreCase(rev)){
    	  System.out.println("true");
    	}else{System.out.println("false");}
}
}
