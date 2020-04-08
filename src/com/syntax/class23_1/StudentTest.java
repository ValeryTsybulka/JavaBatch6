package com.syntax.class23_1;



public class StudentTest {
public static void main(String[] args) {
//	Student nn=new Student();
//	nn.doNW();
//	nn.study();
//	System.out.println("----------------------");
	
	SyntaxStudent nn1=new SyntaxStudent();
	//nn1.doNW();
	nn1.getGob();
	nn1.study();
	System.out.println("----------------------");
	
	Student nn2=new SyntaxStudent();
	nn2.doNW();
	nn2.study();
	nn2.getGob();
}
}
