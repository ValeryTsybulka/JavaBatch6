package com.syntax.class20_1;

public class ShoppingStore {
String item;
double price, quantity;
static double sum=0;
ShoppingStore(String item, double price, double quantity){
	this.item=item; this.price=price; this.quantity=quantity;}

public double itemTotalPrice() {
	double totalValue=price*quantity;
	System.out.println(item+" Total Value "+totalValue);
	sum=sum+totalValue;
	return totalValue;
}
}
