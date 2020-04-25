package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Countries {
	public static void main(String[] args) {
		Map<String, Integer> st = new HashMap<>();
		
		st.put("January", 31);
		st.put("Fabruary", 28);
		st.put("March", 31);
		st.put("April", 30);
		st.put("May", 31);
		st.put("June", 30);
		
		//System.out.println(st);
		//System.out.println(st.size());
		
			Set<Entry<String, Integer>> month=st.entrySet();
			
			for(Entry a:month) {
				//System.out.print(a+" ");
				System.out.print(a.getKey()+" ");
				//System.out.println();
				System.out.print(a.getValue()+" ");
			}
		}		
	}


