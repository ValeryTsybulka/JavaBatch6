package com.syntax.class06;

import java.util.Scanner;

public class Class02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale = scan.nextLine();
		double discount;
		double price;
		double finalPrice;

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("Enter your price");
			price = scan.nextDouble();

			if (price < 20) {
				discount = price * 0.1;
			} else if (price >= 20 && price < 100) {
				discount = price * 0.2;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.3;
			} else {
				discount = price * 0.5;
			}
			finalPrice = price - discount;
			System.out.println("After discount the price of the item reduced from " + price + " too " + finalPrice);
		} else {
			System.out.println("We don't go shopping");

		}

	}
}
