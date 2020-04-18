package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
public class FoodTest {
	public static void main(String[] args) {
		ArrayList<Food> food = new ArrayList<>();
		food.add(new Milk());
		food.add(new Meet());
		food.add(new Fruit());
		food.add(new Cheese());
		for (int i = 0; i < food.size(); i++) {
			food.get(i).m1();
		}
		System.out.println("======Advanced foor loop======");
		for (Food a : food) {
			a.m2();
		}
		System.out.println("======Interate======");
		Iterator<Food> it = food.iterator();
        while(it.hasNext()) {
        	it.next().m3();
        }
	}
}
