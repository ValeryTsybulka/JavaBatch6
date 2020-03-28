package com.syntax.class15;

public class Grade {

	char grade(int a) {
		char grade;
		if(a>=90) {
			grade='A';
		}else if(a<90&&a>=80) {
			grade='B';
		}else {
			grade='C';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		Grade obj=new Grade();
		char grade=obj.grade(81);
		System.out.println(grade);
	}
}
