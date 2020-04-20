package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class BestBuy {
	public static void main(String[] args) {
		Map<Integer, String> bb = new HashMap<>();
		bb.put(7664847, "TV");
		bb.put(7664848, "CD");
		bb.put(7664849, "Laotop");
		bb.put(7664850, "Computer");
		System.out.println(bb);

		Set<Entry<Integer, String>> bbStore = bb.entrySet();
		
		for(Entry a:bbStore) {
			System.out.print(a.getKey()+"  "+a.getValue()+" ");
		}

	}

}
