package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<>();
		str.add("hi");
		str.add("yo");
		str.add("yolo");
		str.add("boop");
		for (int i = 0; i < str.size(); i=i+2) {
			str.remove(i);
		}
		Iterator<String> s = str.iterator();
		while (s.hasNext()) {
			System.out.print(s.next()+" ");
		}
	}
}
