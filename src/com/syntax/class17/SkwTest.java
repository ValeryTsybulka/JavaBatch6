package com.syntax.class17;

public class SkwTest {
public static void main(String[] args) {
SkwTest obj=new SkwTest();
	obj.poli2("control");
	obj.poli1("madam");
	obj.poli1("mm mm mm");
}

	 void poli1(String word) {
	String rev="";
	int a=word.length();
	for(int i=a-1; i>=0; i--) {
		rev+=word.charAt(i);
	}
	if(word.contentEquals(rev)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}}
	void poli2(String word) {
		char[] array=word.toCharArray();
		String rev="";
		for(int i=array.length-1; i>=0; i--) {
			rev+=array[i];
		}
		if(word.equalsIgnoreCase(rev)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
