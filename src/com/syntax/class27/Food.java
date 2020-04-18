package com.syntax.class27;

public abstract class Food {
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
class Milk extends Food{

	public void m1() {System.out.println("I like milk m1");}
	public void m2() {System.out.println("I like milk m2");}	
	public void m3() {System.out.println("I like milk m3");}
}
class Meet extends Food{
	public void m1() {System.out.println("I like meet m1");}
	public void m2() {System.out.println("I like meet m2");}	
	public void m3() {System.out.println("I like meet m3");}	
}
class Fruit extends Food{
	public void m1() {System.out.println("I like fruit m1");}
	public void m2() {System.out.println("I like fruit m2");}	
	public void m3() {System.out.println("I like fruit m3");}
}
class Cheese extends Food{
	public void m1() {System.out.println("I like cheese m1");}
	public void m2() {System.out.println("I like cheese m2");}	
	public void m3() {System.out.println("I like cheese m3");}
}
