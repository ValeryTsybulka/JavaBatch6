package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
	     ArrayList<String> cars= new ArrayList<>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("GMC");
		
		
		for(String a:cars) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0; i<cars.size(); i++) {
			System.out.print(cars.get(i)+" ");
		}
		System.out.println();
		Iterator <String> car=cars.iterator();
		while(car.hasNext()) {
			System.out.print(car.next()+" ");
		}
	}
}
