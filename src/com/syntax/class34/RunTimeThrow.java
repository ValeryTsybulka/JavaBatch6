package com.syntax.class34;

public class RunTimeThrow {

	public static void main(String[] args) {
		try {
			temterature(31);
		} catch (RuntimeException rt) {
			System.out.println(rt);
		}
	}

	public static void temterature(int a) {
		if (a < 32) {
			throw new RuntimeException("It is freezing");
		}

	}
}
