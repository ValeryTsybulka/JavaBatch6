package com.syntax.class26;

public class Truck extends Car1 {
	int weight;
Truck(int carPrice, String color, int weight) {
		super(carPrice, color);
		this.weight=weight;
	}



@Override
double culculateSalePrice() {
	if(weight>2000) {
		carPrice-=carPrice*0.1;
	}else { carPrice-=carPrice*0.2;    }
	return carPrice;
}
	

}
