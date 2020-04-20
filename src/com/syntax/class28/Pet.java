package com.syntax.class28;

public class Pet extends Insurence {
	public Pet(String insurenceName, String petType) {
		super(insurenceName);
		this.petType=petType;
	}

	String petType;

	@Override
	void getQuote() {
		System.out.println(insurenceName+" care about "+ petType);
		
	}

	@Override
	void cancelInsurence() {
		System.out.println(insurenceName+" still care about "+ petType);
		
	}

}
