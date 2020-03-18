package com.syntax.class10;

public class Hw82 {
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int[] b = new int[4];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			b[i] = sum;
		}

		for (int c : b)
			System.out.println(c);

	}
}
