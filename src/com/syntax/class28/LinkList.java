package com.syntax.class28;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkList {

	public static void main(String[] args) {	
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Vova");
		llist.add("Gora");
		llist.add("Goga");
		llist.add("Vitja");
		int size = llist.size();
		System.out.println(size);
System.out.println(llist);
System.out.println("----------------------");
		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {
			if(it.next().contains("v")) {
				it.remove();
			} }
		System.out.println(llist);
		//List<Food> food=new LinkedList<>();	
	}
}
