package com.syntax.class20_1;

public class Method {
//	static int[][] a={
//		    {1,2,3},
//		    {4,5,6},
//		    {7,8,9}
//		  };
	 public static int sum(int[][] a){
		    int sum1=0;
		    for(int i=0; i<a.length; i++){
		      for(int j=0; j<a[i].length; j++){
		        sum1=sum1+a[i][j];
		      }
		      }
		    System.out.println(sum1);
		    return sum1;
		  }
	
}
