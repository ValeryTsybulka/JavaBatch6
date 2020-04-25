package com.syntax.class30;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("Name", "John");
		hmap.put("LastName", "Smith");
		hmap.put("Address", "123 test");
		hmap.put("City", "NY");
		
		boolean isEmpty=hmap.isEmpty();
		System.out.println("Map is empty ="+isEmpty);
		
		int size=hmap.size();
		System.out.println(size);
		
		hmap.put("Zip", "1234");
		System.out.println(hmap);
		hmap.put("Zip", "4567");
		System.out.println(hmap);
		hmap.replace("Zip", "9999");
		System.out.println(hmap);
		hmap.remove("Zip");
		System.out.println(hmap);
		System.out.println(hmap.get("Name"));
	}
}
