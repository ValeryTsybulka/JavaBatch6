package com.syntax.class12;

import java.util.Scanner;

public class Ripl92 {
	public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a word");
		  String word=scan.nextLine();
		  System.out.println("The first 3 letters of "+word+" is"+word.substring(0, 3));
		  
}}
   