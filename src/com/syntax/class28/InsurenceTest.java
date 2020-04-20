package com.syntax.class28;

import java.util.*;

public class InsurenceTest {

	public static void main(String[] args) {
		List<Insurence>alist=new ArrayList<>();
		alist.add(new Car("Task", "BMW"));
		alist.add(new Pet("Task", "Bobic"));
		alist.add(new Health("Task"));
		for(Insurence a:alist) {
			a.getQuote();
			a.cancelInsurence();
		}System.out.println("-----------------");
		Iterator<Insurence>it=alist.listIterator();
		while(it.hasNext()) {
			Insurence obj=it.next();
			obj.getQuote();
			obj.cancelInsurence();
		}
	}
}
