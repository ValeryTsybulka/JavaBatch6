package com.syntax.class30;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<String>word=new LinkedHashSet<>();
		word.add("third");
		word.add("first");
		word.add("second");
		System.out.println(word);
		
		word.clear();
		System.out.println(word);
		
}}
