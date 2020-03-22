package com.syntax.class14;

public class Garag {
public static void main(String[] args) {
	Car car1=new Car();
	car1.make="Toyota";
	car1.model="Highlender";
	car1.year=2020;
	
	Car car2=new Car();
	car2.make="Honda";
	car2.model="Accord";
	car2.year=2020;
	
	car1.accelerate();
	car1.drive();
	car1.stop();
	
	car2.accelerate();
	car2.drive();
	car2.stop();
}
}
