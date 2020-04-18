package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(111);
		num.add(111);
		num.add(111);
		num.add(999);
		num.add(999);
		num.add(999);

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
			
			for(Integer a:num) {
				System.out.println(a);
			}
			
			Iterator<Integer> n=num.iterator();
			while(n.hasNext()) {
				System.out.println(n.next());
			}
		}}}
	

