package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		car.add("BMW");
		car.add("Honda");
		car.add("Toyota");
		car.add("GMC");
		for (int i = 0; i < car.size(); i++) {
			System.out.print(car.get(i) + " /");
		}
		for (String a : car) {
			System.out.print(a + " -");
		}
		System.out.println();

		Iterator<String> it = car.iterator();
		while (it.hasNext()) {
			if (it.equals("GMC")) {
				it.remove();
			}
			System.out.print(it.next() + "* ");
		}
	}

}
