package com.syntax.class20_1;

public class CarObject {
	String model;
	int quantity;
	double price;
	
	CarObject(String model, double price, int quantity){
		this.model=model; this.price=price; this.quantity=quantity;}

	public double carStokValue(double price, int quantity) {
		return  price*quantity;
		
	}
	public void show() {
		System.out.println(model+" Stok Value "+carStokValue(price, quantity));
	}
}
