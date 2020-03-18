package com.syntax.class10;

public class Hw6 {
public static void main(String[] args) {
	String[] c= {"Belarus","Litva","USA"};
	
	for(int i=0; i<c.length; i++) {
	switch(c[i]) {
	case "USA":
	System.out.println("The Capital of "+c[i]+" is Washington.");
	break;
	case "Belarus":
		System.out.println("The Capital of "+c[i]+" is Minsk.");
		break;
	case "Litva":
		System.out.println("The Capital of "+c[i]+" is Vilna.");
	
		
	
	}
	}
	System.out.println("**************************************************************");
	
	for(int i=0; i<c.length; i++) {
		
		if(c[i].equals("USA")) {
			System.out.println("The Capital of "+c[i]+" is Washington.");
		}
		
		if(c[i].contentEquals("Belarus")) {
			System.out.println("The Capital of "+c[i]+" is Minsk.");
			}
		
		if(c[i].contentEquals("Litva")) {
		
			System.out.println("The Capital of "+c[i]+" is Vilna.");
		
		}
	
}
}}
