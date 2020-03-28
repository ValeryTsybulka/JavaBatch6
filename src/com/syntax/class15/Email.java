package com.syntax.class15;

public class Email {
String name;
String lastName;
String type;

void email(String a, String b, String c) {
	System.out.println(a+b+"@"+c+".com");
}

public static void main(String[] args) {
	Email obj1=new Email();
	Email obj2=new Email();

	obj1.email("john","snow","mail");
	obj2.email("john","snow","yahoo");
}

}
	
	

