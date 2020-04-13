package com.syntax.class26;

public class Sedan extends Car1 {
int length;
	Sedan(int carPrice, String color, int length) {
		super(carPrice, color);
		this.length=length;
	}

	@Override
	double culculateSalePrice() {
		if(length>20) {
			carPrice-=carPrice*0.05;
		}else {  carPrice-=carPrice*0.1; }
		return carPrice;
	}

	

}
