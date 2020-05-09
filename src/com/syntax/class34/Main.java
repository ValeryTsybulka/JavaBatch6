package com.syntax.class34;

public class Main {

	public static void checkGrade(int grade) {
		if (grade > 90) {
			throw new SyntaxStudentException("You are an exceptionally awesome student");
		} else {
			System.out.println("You are a grade student");
		}

	}

	public static void main(String[] args) {
		try {
		checkGrade(91);
		}catch(SyntaxStudentException sse) {
			System.out.println(sse);
		}

	}
}
