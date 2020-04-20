package com.syntax.class27;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPerform {
	public static void main(String[] args) {
		
	List<Food>food=new LinkedList<>();	
	food.add(new Milk());
	food.add(new Meet());
	food.add(new Fruit());
	food.add(new Cheese());
	
	for(Food a:food) {
		a.m1();
		a.m2();
		a.m3();
	}
	}
}
