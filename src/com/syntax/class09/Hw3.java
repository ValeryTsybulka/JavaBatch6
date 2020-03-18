package com.syntax.class09;

public class Hw3 {
	public static void main(String[] args) {
		String[] word = { "Java ", "Saturday ", "Day.", "coding ", "is " };
		System.out.println(word[1] + word[4] + word[0] + word[3] + word[2]);
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		for (String a : word) {
			System.out.print(a);
		}
		int[] num = { 1, 11, 111, 2, 22, 222 };
		int sum=0;
		for (int a : num) {
			sum = sum + a;
		}System.out.println();
		System.out.println(sum);
		sum=0;
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
}
