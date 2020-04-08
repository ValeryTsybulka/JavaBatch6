package com.syntax.class23;

class Main {
	  void show(int a){
	    System.out.println(a);
	  }
	  void show(String a){
	    System.out.println(a);
	  }
	  void show(double a){
	    System.out.println(a);
	  }
	  public static void main(String[] args){
	    Main nn=new Main();
	   
	    nn.show(100);
	   nn.show(100.99);
	   nn.show("privet");
	  }
	}

