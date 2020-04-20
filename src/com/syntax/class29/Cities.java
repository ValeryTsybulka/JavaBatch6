package com.syntax.class29;

import java.util.*;

public class Cities {
public static void main(String[] args) {
	Set<String> names=new LinkedHashSet<>();
	names.add("Ankara");
	names.add("Minsk");
	names.add("Vilna");
	names.add("Vitebsk");
	names.add("Sluck");
	names.add("Brest");
	System.out.println(names);
	
	Iterator<String> it=names.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");}
	System.out.println("------>");
	
	Set<String> names1=new HashSet<>(names);
	Iterator<String> it1=names1.iterator();
	while(it1.hasNext()) {
		System.out.print(it1.next()+" ");}
	System.out.println();
	System.out.println("*********************");
	
	Set<String> names2=new TreeSet<>(names);
	Iterator<String> it2=names2.iterator();
	while(it2.hasNext()) {
		
		if(it2.next().startsWith("A")){
				it2.remove();
				}}
		System.out.print(names2+" ");
	
}
}
