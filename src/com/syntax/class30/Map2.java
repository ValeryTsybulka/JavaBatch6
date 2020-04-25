package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		Map<String, Integer> obj = new HashMap<>();
		obj.put("mango", 10);
		obj.put("apple", 30);
		obj.put("orange", 20);
		obj.put("mango", 40);
		obj.put("mango", 40);
		System.out.println(obj);
		Set<String> key=obj.keySet();
		System.out.println(key);
		for(String a:key) {
			System.out.println(a+" = "+obj.get(a));
		}
		Set<Entry<String, Integer>> fruit = obj.entrySet();
		System.out.println("-----------------");
		System.out.println(fruit);
		Iterator<Entry<String, Integer>> it = fruit.iterator();
		while(it.hasNext()) {
			Entry a=it.next();
			
			System.out.println("Key = "+a.getKey()+" and value = "+a.getValue());
		}

	}
}
