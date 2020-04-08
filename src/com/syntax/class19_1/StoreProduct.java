package com.syntax.class19_1;

public class StoreProduct {
String label;
String category;
boolean hasExpiration;
double price;
int stock;

public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
this.label=label; this.category=category; this.hasExpiration=hasExpiration; this.price=price;
this.stock=stock;}

public StoreProduct(String label,double price, int stock) {category="misc";
	this.label=label; this.price=price;this.stock=stock;}
		
public StoreProduct(String label, double price) {
	this.label=label; this.price=price;
}
public void display() {
	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+" "+stock);
}


}
