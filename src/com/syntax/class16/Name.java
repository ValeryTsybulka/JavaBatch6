package com.syntax.class16;

public class Name {
	String name="John";//instance variable

	public static void main(String[] args) {

		String name="Yunus";
		System.out.println(name+"1");

		Name object=new Name();
		System.out.println(object.name+"2");

		object.name="Ali";
		System.out.println(name+"3");
		System.out.println(object.name+"4");

		//change value of local variable
		name="Farid";
		System.out.println(name+"5");
	}
}

