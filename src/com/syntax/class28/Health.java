package com.syntax.class28;

public class Health extends Insurence{

	public Health(String insurenceName) {
		super(insurenceName);
		
	}

	@Override
	void getQuote() {
		System.out.println(insurenceName+" care about you");
		
	}

	@Override
	void cancelInsurence() {
		System.out.println(insurenceName+" stopped care about you");
	}

}
