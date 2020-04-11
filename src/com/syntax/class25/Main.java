package com.syntax.class25;

public class Main {
	public static void main(String[] args) {
		int[] a = { 2, 7, 3, 8, 4 };
		System.out.println(avgElements(a)); // should print 4.8
	}

	static double avgElements(int[] a) {
		double sum = 0;
		for (int c : a) {
			sum += c;
		}
		return sum / a.length;
	}
}
