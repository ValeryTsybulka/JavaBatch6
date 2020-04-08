package com.syntax.class19_1;

public class Car {
String make, model;
int numberOfDors, topSpeed;
double price;
public Car(String make, String model, int numberOfDors, int topSpeed, double price) {
	this.make=make; this.model=model; this.numberOfDors=numberOfDors; this.topSpeed=topSpeed;
	this.price=price;}

public Car(String make, String model, int topSpeed, double price) {numberOfDors=4;
	this.make=make; this.model=model;  this.topSpeed=topSpeed;this.price=price;}
public Car(int numberOfDors, int topSpeed, double price) {make="unknown";model="unknown";
	this.numberOfDors=numberOfDors; this.topSpeed=topSpeed;this.price=price;}
	
public Car(String make, String model, int numberOfDors) {topSpeed=90;price=0;
	this.make=make; this.model=model; this.numberOfDors=numberOfDors;}
public void display() {
	System.out.println(make+" "+model+" "+numberOfDors+" "+topSpeed+" "+price);
}
}
