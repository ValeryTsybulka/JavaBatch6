package com.syntax.class26_2;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(8);//autoboxing
		numbers.add(8);
		numbers.add(8);
		numbers.add(8);
		System.out.println(numbers);
		for(int i=0; i<numbers.size(); i++) {
			int a=numbers.get(i);
			System.out.print(a);
		}
		System.out.print(" don't be scary ");
		for(Integer a:numbers) {
			System.out.print(a);
		}
	}

}
