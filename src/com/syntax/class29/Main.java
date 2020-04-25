package com.syntax.class29;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Set<Student1> obj = new LinkedHashSet<>();
		obj.add(new Student1(101, "Samair", "Jawaid"));
		obj.add(new Student1(102, "Asel", "Umurzakova"));
		obj.add(new Student1(103, "Diego", "Juarez"));
		obj.add(new Student1(104, "Sohil", "Aryan"));
		obj.add(new Student1(105, "Alijon", "Nazarov"));
//
//		for (String a : obj) {
//			System.out.println(a);
//		}
//
		Iterator<Student1> it = obj.iterator();
		    while (it.hasNext()) {
		    	Student1 a=it.next();
			a.show();
		}

	}

}
