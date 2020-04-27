package com.syntax.class30;

import java.util.Map.Entry;
import java.util.*;

public class Map3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		System.out.println(map);

		Set<Entry<String, String>> setEntry = map.entrySet();
		System.out.println(setEntry);
		
		System.out.println("HashMap Before Remove :");
		for (Entry<String, String> entry : setEntry) {
			String a = entry.getValue();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		Iterator<Entry<String, String>> it = setEntry.iterator();
		while (it.hasNext()) {
			String a = it.next().getKey();
			if (a.equals("ONE") || a.equals("FOUR")) {
				it.remove();
			}
		}
		System.out.println("--------------------");
		for (Entry<String, String> entry : setEntry) {
			String a = entry.getValue();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

//		Collection<String> value = nn.values();
//		Iterator<String> it = value.iterator();
//		while (it.hasNext()) {
//			String a = it.next().toUpperCase();
//			System.out.println(a);
//		}

	}
}
