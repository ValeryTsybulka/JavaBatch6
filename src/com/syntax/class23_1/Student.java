package com.syntax.class23_1;

public abstract class Student {
	void study() {
		System.out.println("Student stadies");
	}
	void doNW() {
		System.out.println("Student do HW");
	}
	abstract void getGob();
}
	 class SyntaxStudent extends Student {
		@Override
		void study() {
			System.out.println("Syntax student");
		}
		
		void getGob() {
			System.out.println("Syntax student become QA automation engineer");
		}
	}


