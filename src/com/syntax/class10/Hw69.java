package com.syntax.class10;

public class Hw69 {
public static void main(String[] args) {
	
	  for(int i=7; i>=1; i--){
		     
	      for(int y=1; y<=i; y++){
	        System.out.print(y+" ");
	      }
	       System.out.println();
	      }
	     for(int i=1; i<=7; i++){
	    	 
	      for(int y=1; y<=i; y++){
	        if(i==1){
	        	continue;
	        };
	        System.out.print(y+" ");
	        }
	      if(i==1) {
	    	  continue;
	      }
	      System.out.println();
	      }
	     int[] num={45,78,12,67,55,89,23,77,88};
	     for(int i=0; i<=num.length; i+=2){
	       System.out.println(num[i]);
	   }
	     
	     String[] a={"This","is","array","of","string"};
	     for(String b:a){
	       System.out.print(a);
	     }
	     int[] a1={45,78,12,67,55,87,23,77,88};
	     for(int i=1; i<=a.length; i+=3){
	       System.out.print(a1[i]/i+" ");
	     }
	     
	     int[] nun=new int[11];
	     for (int i=0; i<num.length; i++){
	       num[i]=2010+i;
	       System.out.println(num[i]);
	     }
}}
