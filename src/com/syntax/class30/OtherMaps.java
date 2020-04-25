package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {
	public static void main(String[] args) {
		Map<Integer, String> lmap=new LinkedHashMap<>();
	lmap.put(11, "John Smith");
	lmap.put(12, "Jane Krouland");
	lmap.put(13, "Ivan Durak");
	System.out.println(lmap);
	
	Map<Integer, String>people=new TreeMap<>();
	people.put(329000, "USA");
	people.put(11404328, "China");
	people.put(1340468, "India");
	people.put(207774, "pakistan");
	people.put(146748, "Russia");
	people.put(81000, "Iran");
	people.put(83000, "Turkish");
	people.put(83019, "Gemany");
	people.put(34218, "SA");
	
	System.out.println(people);
	
	}
}
