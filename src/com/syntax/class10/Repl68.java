package com.syntax.class10;

public class Repl68 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println();
			for (int y = 1; y <= 4; y++) {
			if (!(i == 2 || i == 3) || !(y == 2 || y == 3)) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
