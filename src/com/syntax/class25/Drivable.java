package com.syntax.class25;

public interface Drivable {
	int a=30;
	void drive();

}
class Car implements Drivable{

	@Override
	public void drive() {
		System.out.println("Speed must be <= "+a);
	}
	
}
          
          
