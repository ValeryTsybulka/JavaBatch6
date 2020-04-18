package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {
	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("milk");
		drinks.add("beer");
		drinks.add("cola");
		drinks.add("soda");
		System.out.println(drinks);
		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
		Iterator<String> it = drinks.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}
}
