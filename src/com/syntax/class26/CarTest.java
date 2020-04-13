package com.syntax.class26;

public class CarTest {
	public static void main(String[] args) {
	//Vichicle[]	car={new Toyota(), new SchoolBus();}
		Toyota nn=new Toyota();
		nn.drive();
		nn.stop();
		nn.break1();
		nn.start();
		System.out.println("________________________");
		SchoolBus nn1=new SchoolBus();
		nn1.drive();
		nn1.stop();
		nn1.break1();
		nn1.start();
		System.out.println("***************************************");
		Vechicle[] a={new Toyota(), new SchoolBus()};
		for(Vechicle z:a) {
			z.drive();
			z.stop();
			z.break1();
			z.start();
		}
		
	}

}
