package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
public static void main(String[] args) {
	ArrayList<String> words=new ArrayList<>();
	words.add("hello");
	words.add("hi");
	words.add("who");
	words.add("me");
	words.add("why");
	words.add("couse");
	System.out.println(words);
	
	Iterator<String> it = words.iterator();
	while(it.hasNext()) {
		if(it.next().endsWith("e")) {
			it.remove();
		}	
	}
	System.out.print(words);
}
}
