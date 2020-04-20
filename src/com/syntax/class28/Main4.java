package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();

		for (int i = 50; i <= 100; i++) {
			num.add(i);
		}
		
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			if(it.next()%3!=0) {
				it.remove();
			}
		}
		System.out.println(num);
	}
}
