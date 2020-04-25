package com.syntax.class29;

public class Student1 {
	int studentId;
	String name,lastName;
	public Student1(int studentId, String name, String lastName) {
		this.studentId=studentId;
		this.lastName=lastName;
		this.name=name;
	}
	public void show() {
		System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
	}

}
