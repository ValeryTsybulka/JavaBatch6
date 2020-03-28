package com.syntax.class17;

public class Repl108 {
	  int sumEvenToX(int x){
	    int sum=0;
	    for(int i=2; i<=x; i+=2){
	      sum+=i;
	    }
	    return sum;
	  }
	  
	  public static void main(String[] args){
		  Repl108 obj=new Repl108();
	    System.out.println(obj.sumEvenToX(5));
	    System.out.println(obj.sumEvenToX(15));
	  }
}
