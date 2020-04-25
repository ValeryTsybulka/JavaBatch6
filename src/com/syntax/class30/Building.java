package com.syntax.class30;

import java.util.*;

public class Building {
	public static void main(String[] args) {
		Map<Integer, String> bb = new HashMap<>();
		bb.put(1, "Syntax");
		bb.put(2, "Google");
		bb.put(3, "Google");
		bb.put(4, "DTCC");
		bb.put(5, "DTCC");
		bb.put(5, "DTC");
		bb.put(6, "VV");
		bb.put(7, "VV");

		Set<Integer> key = bb.keySet();// collection of keys
		Collection<String> values = bb.values();//collection of values
		System.out.println(bb);
		System.out.println(bb.keySet());
		System.out.println(bb.values());
		System.out.println(bb.entrySet());
		for (int a : bb.keySet()) {
			System.out.print(a + " ");
		}
		for (String a : bb.values()) {
			System.out.print(a + " ");
		}
		for (Object a : bb.entrySet()) {
			System.out.print(" " + a + " ");
		}System.out.println();
		Iterator<String>it=values.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" MY; ");
		}
	}
}
