package com.syntax.class32;

import java.util.*;
import java.util.Map.*;

class Main {
	// public static void display(Map<String,Double> map){
	List<Entry<String, Object>> dataList = new HashMap<>();

	Iterator <Entry<String,Double>> dateList = set.iterator();
	if(map.isEmpty()) {
	
		System.out.println("map is empty");
	}else{{
	
		while (it.hasNext()) {
			Entry<String, Double> ent = it.next();
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
	}
	}

	private static List<Entry<String, Object>> ArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 20);
		map.put("orange", 21);
		Set<Entry<String, Integer>> set = map.entrySet();
		display(map);
		map.clear();
		display(map);
	}
}
