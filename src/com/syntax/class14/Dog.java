package com.syntax.class14;

public class Dog {
String breed, color,name;
int age;

public static void main(String[] args) {
	
	Dog dog1=new Dog();
	dog1.breed="German Shepperd";
	dog1.color="Brown";
	dog1.name="Max";
	dog1.age=3;
	dog1.bark();
	dog1.eat();
	dog1.run();
	Dog dog2 = new Dog();
	dog2.breed = "Husky";
	dog2.color = "White";
	dog2.name = "Snow";
	dog2.age = 5;	
	dog2.age=3;
	dog2.bark();
	dog2.eat();
	dog2.run();
	
}

void eat() {
	System.out.println(name+" can eat");
}
void bark() {
	System.out.println(name+" can bark");
}
void run() {
	System.out.println(name+" can run");
}
}
