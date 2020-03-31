package com.syntax.class19;

public class Main1 {
	public String name;
	protected String city;
	String name_of_the_school;
	private int butchNumber;
	   void show(){
	    System.out.println("My name is "+name+" and I live in "+city+". I study at ");
	    System.out.println(name_of_the_school+" school in butch "+butchNumber);
	  }
	  
	  public static void main(String[] args){
	    
	    Main1 obj=new Main1();
	    obj.show();
	  }
		
}
