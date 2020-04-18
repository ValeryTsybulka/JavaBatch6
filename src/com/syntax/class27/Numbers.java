package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

		for (int i = 0; i <= 50; i += 2) {
			num.add(i);
		}
		System.out.println(num);
		Iterator <Integer> it = num.iterator();
         while(it.hasNext()) {
        	 if(it.next()%5==0) {
        		 it.remove();
        	 }
	}
         System.out.println(num);
	}
}
