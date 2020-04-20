package com.syntax.class28;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Insurence> hset = new HashSet<>();
		hset.add(new Car("Task", "BMW"));
		hset.add(new Pet("Tooson", "Bobic"));
		hset.add(new Health("Fidelic"));

		Iterator<Insurence> it = hset.iterator();
		while(it.hasNext()) {
		
			Insurence obj=it.next();	
			obj.getQuote();
			obj.cancelInsurence();
		}
	}
}
