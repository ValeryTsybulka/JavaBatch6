package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1; i<100; i++) {
			if(i%7==0) {
				num.add(i);
		}}
		System.out.println(num);
		Iterator<Integer>it=num.iterator();
		while(it.hasNext()) {
			if(it.next()%10==0) {
				it.remove();
			}
		}
		System.out.println(num);
	}
}
