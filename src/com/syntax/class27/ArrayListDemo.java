package com.syntax.class27;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList array=new ArrayList<>();
		array.add(2);
		array.add("mm");
		array.add(2, 5);
		array.addAll(array);
		System.out.println(array.contains(5));
		System.out.println(array.size());
		System.out.println(array.clone());
		System.out.println(array);
		
		//Iterator it=array.iterator();		
		
		for(Object a:array) {
			System.out.print(a+" ");
		}
	
		}
	}


