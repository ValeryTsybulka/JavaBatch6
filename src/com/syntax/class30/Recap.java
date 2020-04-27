package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Recap {
	public static void main(String[] args) {
		Map<String, Integer> grosery= new HashMap<>();
		grosery.put("Milk", 1);
		grosery.put("Meet", 2);
		grosery.put("Fish", 5);
		grosery.put("Fruit", 10);
		
		Set<Entry<String, Integer>>set=grosery.entrySet();
		System.out.println(set);
		
		for(Entry a:set) {
			System.out.println(a.getKey()+" : "+a.getValue());
		}
		Iterator<Entry<String, Integer>> it2=set.iterator();
		while(it2.hasNext()) {
			Entry a=it2.next();
			System.out.println(a.getKey()+" :: "+a.getValue());
		}
		
		Map<String, Integer>deli=new LinkedHashMap<>();
		deli.put("Tea", 2);
		deli.put("Coffee", 1);
		deli.put("Soda", 3);
		deli.put("Vodka", 0);
		
		Map<String, Integer>mix=new TreeMap<>();
		mix.putAll(deli);
		mix.putAll(grosery);
		System.out.println(mix);
		for(String a:mix.keySet()) {
			System.out.print(a+"    ");
		}
			System.out.println();
			Iterator<String>it=mix.keySet().iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+"    ");
			}
			System.out.println();
			Iterator<Integer>it1=mix.values().iterator();
			while(it1.hasNext()) {
				System.out.print(it1.next()+"        ");
			}
		
		
		
	}

}
