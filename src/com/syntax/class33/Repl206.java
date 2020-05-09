package com.syntax.class33;

public class Repl206 {
	 public static void main(String[] args) {
		 int[] array = { 1, 2, 3 };
		 		try {
		 			System.out.println(array[4]);
		 		} catch (ArrayIndexOutOfBoundsException aob) {
		 			aob.printStackTrace();
		 		}
		 	}
}
