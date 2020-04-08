package com.syntax.class22;

public class Main extends Method {
	 static int[][] c={
			    {1,2,3},
			    {4,5,6},
			    {7,8,9}
			  };
			  
			  public static void main(String[] args){
				//sum(c);
				int b=sum(c);
			    System.out.println(b);
			    System.out.println(sum(c));
			    System.out.println(Method.sum(c));
			  }
}
