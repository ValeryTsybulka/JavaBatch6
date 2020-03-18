package com.syntax.class04;

public class HwAnnF16_02 {

	public static void main(String[] args) {

		double mortgageRate = 4.3;
		double mortgagePrice = 150000;

		if (mortgageRate > 4.5) {
			System.out.println("I am not buying a house");
		} else {
			System.out.println("I will think about buying a house");

			if (mortgagePrice < 200000) {
				System.out.println("I will pay cash");
			} else {
				System.out.println("I will take a loan");
			}
		}

	}

}
