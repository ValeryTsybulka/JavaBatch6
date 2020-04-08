package com.syntax.class22_1;

public class Main1 {
	public static void main(String[] args) {
		Student nn=new Student();
	     nn.print();	
	     
	     Student nn1=new SyntaxStudent();
	     nn1.print();
	     
	     Student nn2=new CollegeStudent();
	     nn2.print();
	     
	     Student nn3=new SchoolStudent();
	     nn3.print();
	     System.out.println("--------------------");
		
		SyntaxStudent nn4=new SyntaxStudent();
		nn4.print();
		nn4.run();
		nn4.good();
		
		
	}
}
