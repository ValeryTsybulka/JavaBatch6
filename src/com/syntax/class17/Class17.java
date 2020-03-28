package com.syntax.class17;

public class Class17 {

	int sum(int[] a) {
		int sum = 0;
		for (int b : a) {
			sum += b;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Class17 obj = new Class17();
		System.out.println(obj.sum(a));
	}
}
