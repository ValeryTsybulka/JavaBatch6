package com.syntax.class12;

public class Repl90 {
	 public static void main(String[] args) {
		    String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		    String a="aaa";
		    String b="abrakadabra";
		    String c="0123456789";
		    System.out.println(c.substring(0, 4));
		    System.out.println(c.substring(4));
		    System.out.println(b.replace("a", "A"));
		    System.out.println(b);
		    System.out.println(b.replaceAll("[^aAeEiIoOuU]", ""));
		    System.out.println(a.replace("aa","b"));
		    System.out.println(str.indexOf("c"));
		    System.out.println(str.indexOf(" "));
		    System.out.println(str.indexOf(target1));
		    System.out.println(str.indexOf(target2));
		    
		    System.out.println(str.indexOf("c"));
		    System.out.println(str.indexOf(" "));
		    System.out.println(str.indexOf(target1));
		    System.out.println(str.indexOf(target2));
}}
