package com.syntax.class28;

import java.util.*;

public class FibonachiLink {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(0);
		num.add(1);
		for (int i = 2; i < 10; i++) {
			num.add(num.get(i - 2) + num.get(i - 1));
		}
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
