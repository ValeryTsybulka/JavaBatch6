package com.syntax.class08;

import java.util.Scanner;

public class UserBuy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount = 0;
		double price = 100;
		
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();
		System.out.println("What the price?");
		amount = scan.nextInt();
		do {
			price = price - amount;

			if (price >0) {
				System.out.println("You should pay $" + price + " more");
				amount = scan.nextInt();
			} else {
				System.out.println("Thanks. Your change is $" + price * (-1));}

		} while (price > 0);

}
}
