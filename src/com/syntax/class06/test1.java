package com.syntax.class06;

import java.util.Scanner;

public class test1 {
	
	//public static void main(String[] args) {
			//int a=75;
		//float a1=5.3f;
			//if(a1==5.3) {
			//	System.out.println("true");
		//}else {
			//	System.out.println("folse");
		//}
		
		
		// Scanner scan=new Scanner(System.in);
		 // System.out.println("Please enter two strings");
		 // String s1=scan.nextLine();
		 // String s2=scan.nextLine();
		 // System.out.println("Please enter two numbers");
		 // int num1=scan.nextInt();
		 // int num2=scan.nextInt();
		 // String result;
		  
		 // if(s1==s2 && num1==num2){
		 //   result="AND";
		 // }else
		//  {  if(s1==s2 || num1==num2){
		 //   result="OR";
		 // }else {   result="NONE"; }
		//  }
		 //		  System.out.println(result);
			  
	public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter two strings");
		  String s1=scan.nextLine();
		  String s2=scan.nextLine();
		  System.out.println("Please enter two numbers");
		  int num1=scan.nextInt();
		  int num2=scan.nextInt();
		  String result;
		  
		  if(s1.equals(s2) && num1==num2){
		    result="AND";
		  }else{
		  if(s1.equals(s2)|| num1==num2){
		    result="OR";
		  }  else {result="NONE";}}
		  System.out.println(result);
		}
		
		
		
	}	
		
	

