package com.syntax.class29;

import java.util.*;

public class Countries {
public static void main(String[] args) {
	Set<String>names=new HashSet<>();
	names.add("Belarus");
	names.add("Ukrain");
	names.add("USA");
	names.add("Litva");
	System.out.println(names);
	
	Set<String>name=new TreeSet<>(names);
	System.out.println(name);
	
	Set<String>name1=new LinkedHashSet<>(names);
	System.out.println(name1);
}
}
