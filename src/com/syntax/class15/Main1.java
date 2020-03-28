package com.syntax.class15;

public class Main1 {
	 String breed;
	  String name;
	  String color;
	  public static void main (String[] args){
	    Main1 dog1= new Main1();
	    Main1 dog2= new Main1();
	    Main1 dog3= new Main1();
	    
	    dog1.breed="Husky";
	    dog1.name="Gusto";
	    dog1.color="yellow";
	    dog1.bark();
	    dog1.run();
	    dog1.play();
	    
	    dog2.breed="Bulldog";
	    dog2.name="Sam";
	    dog2.color="black";
	    dog2.bark();
	    dog2.run();
	    dog2.play();
	    
	    dog3.breed="Labrador";
	    dog3.name="Bobic";
	    dog3.color="speckled";
	    dog3.bark();
	    dog3.run();
	    dog3.play();
	  }
	  void bark(){System.out.println(breed+" can bark");}
	  void run() {System.out.println(breed+" can run");}
	  void play(){System.out.println(name+ " can play");}
	  
}
