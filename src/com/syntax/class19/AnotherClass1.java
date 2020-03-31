package com.syntax.class19;

class AnotherClass1 {
	String m1() {
		return "default";
	}	

 public static class Nut {
	
	public static void main(String[] args) {
		AnotherClass1 obj=new AnotherClass1();
		System.out.println(obj.m1());
		obj.m1();
	}
	
}}
