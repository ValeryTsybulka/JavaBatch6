package com.syntax.class24;

public abstract class File {
	
	 abstract void open(); 
	
	 void edit() {
		 System.out.println("To edit use VI");
	 }
	
	void close() {
		System.out.println("To close use escape");
	}

}
