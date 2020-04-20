package com.syntax.class28;

public class Car extends Insurence{
	String carModel;
	public Car(String insurenceName, String carModel) {
		super(insurenceName);
		this.carModel=carModel;
	}

	

	@Override
	void getQuote() {
		System.out.println(insurenceName+" care about "+ carModel);
	}

	@Override
	void cancelInsurence() {
		System.out.println(insurenceName+" doesn't care about "+ carModel);
	}

}
