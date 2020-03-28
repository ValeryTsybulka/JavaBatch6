package com.syntax.class15;

class Main {
	int roll_no;
	String name;

	public static void main(String[] args) {
		Main obj = new Main();

		obj.roll_no = 2;
		obj.name = "John";
		obj.print();
	}
	void print() {
		System.out.println("Name is "+name+" and roll number is "+roll_no);
	}
}
