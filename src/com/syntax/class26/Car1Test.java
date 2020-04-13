package com.syntax.class26;

public class Car1Test {
public static void main(String[] args) {
	Car1 nn1=new Sedan(20000, "White", 14);
	double a=nn1.culculateSalePrice();
	Car1 nn2=new Truck(50000, "Red", 3500);
	double b=nn2.culculateSalePrice();
	System.out.println("Sedan prise = "+a);
	System.out.println("Truck prise = "+b);
	
}
}
