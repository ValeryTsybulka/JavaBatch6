package com.syntax.class19_1;

public class Dog {
String dogName;
double dogWeight;
static String dogBreet="Mutt";
public Dog(String dogName, double dogWeight) {
	this.dogName=dogName; this.dogWeight=dogWeight;
}
void display() {
	System.out.println(dogName+" "+dogBreet+" "+dogWeight);
}
}
