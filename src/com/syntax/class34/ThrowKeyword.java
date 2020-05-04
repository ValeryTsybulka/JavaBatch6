package com.syntax.class34;

class BalanceException extends RuntimeException{
	BalanceException(String message){
		super(message);
	}
}
public class ThrowKeyword {

	public static void main(String[] args) {
	
	//System.out.println(remind(100, 120));
	browser("chromer");
	System.out.println("Put more money");
}
//	
//	public static int remind(int balance, int amount) {
//		if(amount>balance) {
//			throw new BalanceException("Your balance is too low");
//		}
//		return balance-amount;		
//	}
	
	public static void browser(String browser) {
		
		switch(browser){
		case "chrome":
			System.out.println("Using chrome");
			break;
		case "firefox":
			System.out.println("Using firefox");
			break;
			default:
				throw new RuntimeException("Invalid browser");
			
		}
		
	}
}