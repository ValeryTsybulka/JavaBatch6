package com.syntax.class30;

import java.util.*;

public class Map1 {
	public static void main(String[] args) {
		Map<String, String> obj = new TreeMap<>();
		obj.put("1 item", "apple");
		obj.put("2 item", "banana");
		obj.put("3 item", "pear");
		obj.put("4 item", "tomato");
		obj.put("5 item", "mango");
		obj.put("6 item", "kiwi");

		for (String a : obj.keySet()) {
			System.out.println("Key is " + a + " and value is " + obj.get(a));

		}
	}
}
