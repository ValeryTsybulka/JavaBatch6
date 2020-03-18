package com.syntax.class10;

public class Hw5 {
	public static void main(String[] args) {
		int[][] num = new int[3][4];
		num[0][0] = 10;
		num[0][1] = 30;
		num[0][2] = 50;
		num[0][3] = 60;

		num[1][0] = 10;
		num[1][1] = 30;
		num[1][2] = 50;
		num[1][3] = 60;
		System.out.println(num[1][2]);

		// --------- and so on --------------
		int[][] nums = { { 10, 20, 30, 40 }, { 50, 55, 60, 65 }, { 1, 2, 3, 4 } };
		System.out.println(nums[1][1]);

		String[][] month = { { "Desember", "January", "Fabruary" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };
		
		for (int i = 0; i < month.length; i++) {// iterates over rows
			System.out.println();
			
			for (int y = 0; y < month[i].length; y++) { // iterates over columns
				System.out.print(month[i][y]+" ");
			}

		}

	}

}
