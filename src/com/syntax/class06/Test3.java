package com.syntax.class06;

import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Are you thirsty?");
		  boolean a1=scan.nextBoolean();
		  System.out.println("are you sleepy?");
		  boolean a2=scan.nextBoolean();
		  String drink;
		  if(a1){
		    if(!a2){drink="Water";}
		  else {drink="Coffee";}
		  }else {
		    if(a2){drink="Tea";}else {drink="Nothing";}
		  }
		  System.out.println("Looks like you need "+drink);
		}
		}