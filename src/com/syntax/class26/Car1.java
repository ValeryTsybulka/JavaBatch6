package com.syntax.class26;

public abstract class Car1 {
	int carPrice;
	String color;
	
	Car1(int carPrice, String color){
		this.carPrice=carPrice;
		this.color=color;
	}
    

abstract double culculateSalePrice();
}
