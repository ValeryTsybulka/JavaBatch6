package com.syntax.class29;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		int flag, j;

		for (int i = 2; i <= 100; i++) {
			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				num.add(i);
			}
		}
		for (Integer a : num)
			System.out.print(a + " ");
	}
}
