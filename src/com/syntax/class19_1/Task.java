package com.syntax.class19_1;

public class Task {

	String state;
	String capital;
	public Task(String state, String capital) {
		this.capital=capital; this.state=state;}

	void S() {System.out.println(state);}
		
	void C() {System.out.println(capital);}
			
	void info() {
		S();
		C();
	}
	public static void main(String[] args) {
		Task obj1=new Task("NY","NY");
		obj1.info();
		 obj1=new Task("Fl","Jac");
		obj1.info();
	}
	
}
