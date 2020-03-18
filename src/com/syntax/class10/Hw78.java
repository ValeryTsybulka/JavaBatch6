package com.syntax.class10;

import java.util.Scanner;

public class Hw78 {
	public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		 int[] num= new int[5];
		 for(int i=0; i<num.length; i++){
		  num[i]=scan.nextInt();
		  	 }
		  	 for(int i=0; i<num.length; i++){
		  	   System.out.println(10*num[i]);
		  	 }
		}
}
