package com.syntax.class18;

public class Constructor1 {

	public Constructor1() {
		System.out.println("public");
	}
	protected Constructor1(String a, String b){
		System.out.println(a+b);
	}
	
	Constructor1(String a){
		System.out.println(a);
	}
	private Constructor1(String a, int b) {
		System.out.println(a+" on $"+b);
	}
	
	public static void main(String[] args) {
		Constructor1 obj=new Constructor1();
		Constructor1 obj1=new Constructor1("protec","ted");
		Constructor1 obj2=new Constructor1("default");
		Constructor1 obj3=new Constructor1("private", 5);
	}
}
