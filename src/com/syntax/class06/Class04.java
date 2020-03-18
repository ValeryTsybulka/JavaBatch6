package com.syntax.class06;

import java.util.Scanner;

public class Class04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String country;
		String favoriteFood;

		System.out.println("What is your coutry?");
		country = scan.next();

		switch (country) {

		case "Belarus":
			favoriteFood = "Draniki";
			break;
		case "Ukrain":
			favoriteFood = "Salo";
			break;
		default:
			favoriteFood = "unknown";
		}
		System.out.println("Your favorite food is " + favoriteFood);

	}

}
