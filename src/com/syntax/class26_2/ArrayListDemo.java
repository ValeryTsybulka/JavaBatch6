package com.syntax.class26_2;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String> arrayList=new ArrayList<>();
	System.out.println(arrayList);
	
	arrayList.add("Valer");
	System.out.println(arrayList);
	
	arrayList.add("Artem");
	System.out.println(arrayList);
	arrayList.add("Victor");
	arrayList.add("Alexandra");
	System.out.println(arrayList.get(3));
	System.out.println(arrayList.size());
	arrayList.remove(1);
	System.out.println(arrayList);
	arrayList.set(0, "Sergey");
	System.out.println(arrayList);
	
	for(int i=0; i<arrayList.size(); i++) {
		String a=arrayList.get(i);
		System.out.println(a);
	}
	System.out.println("-----------------");
	
	for(String a:arrayList) {
		System.out.println(a);
	}
}
}
