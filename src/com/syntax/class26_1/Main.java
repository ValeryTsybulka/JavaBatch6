package com.syntax.class26_1;

class Main extends Parent {
	  void m2(){
	    System.out.println("Parent class providing implementation");
	  }
	  
	  public static void main(String[] args){
	    Main nn=new Main();
	    nn.m1();
	    nn.m2();
	    
	  }

	}
