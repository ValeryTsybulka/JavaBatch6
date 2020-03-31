package com.syntax.class19;

class Main {
	public static String alphabetical(String str) {
		char[] array = str.toCharArray();
		for(int z:array) {
			System.out.println(z);}
		String newStr = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				newStr += array[i];
			}}	
		return newStr;}
	// test case below (dont change):
	public static void main(String[] args) {
		Main obj = new Main();
		String a=obj.alphabetical("hello");
		System.out.println(a);
		System.out.println(alphabetical("hello")); // "hlo"
	}
}