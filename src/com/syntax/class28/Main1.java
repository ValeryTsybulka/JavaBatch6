package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
public static void main(String[] args) {
	ArrayList<Integer> array=new ArrayList<>();
	
	array.add(111);
	array.add(222);
	array.add(333);
	array.add(444);
	array.add(555);
	array.add(666);
	
	System.out.println(array);
	//array.removeAll(array);
	array.clear();
	System.out.println(array);
	
//	
//	Iterator<Integer> num=array.iterator();
//	while(num.hasNext()) {
//		System.out.print(num.next());
//	}
//	
}
}
