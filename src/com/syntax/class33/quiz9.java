package com.syntax.class33;

import java.util.ArrayList;

public class quiz9 {
public static void main(String[] args) {
	ArrayList myList=new ArrayList(); String[]myArray;
	try {
		while(true) {myList.add("My String");
		}
	
	}catch(RuntimeException re) {
		System.out.println("Caught a RuntimeException");
	}catch(Exception e) {
		System.out.println("Caught------------------");}
	System.out.println("Ready********************");
}
}
