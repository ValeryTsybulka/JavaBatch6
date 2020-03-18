package com.syntax.class10;

import java.util.Scanner;

public class Repl77 {
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    int[] num=new int[5];
	    for(int i=0; i<num.length; i++){
	      num[i]=scan.nextInt();
	      }
	    for(int y=4; y>=0; y--){
	      System.out.println(num[y]);
	    }
	    
	  }
}
