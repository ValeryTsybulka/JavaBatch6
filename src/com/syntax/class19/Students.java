package com.syntax.class19;

public class Students {
String name, adres;
Students(String name, String adres){
	this.name=name;
	this.adres=adres;	
}
void displayInfo() {
	System.out.println(name+" "+adres);
}
public static void main(String[] args) {
	Students obj=new Students("Vova", "Minsk");
	obj.displayInfo();
}
}
