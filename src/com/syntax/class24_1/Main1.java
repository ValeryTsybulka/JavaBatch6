package com.syntax.class24_1;

public class Main1 {
	static String hello="hello";
	static String revers="";
	 static final String word(){
	  
	for(int i=hello.length()-1; i>=0; i--) {
	  revers+=hello.charAt(i);
	}
	return revers;
	}

	public static void main(String[] args){
	  System.out.println(Main1.word());
	  
	}	
}
