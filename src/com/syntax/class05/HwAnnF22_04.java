package com.syntax.class05;

import java.util.Scanner;

public class HwAnnF22_04 {
	public static void main(String[] args) {
		String season = "Wrong enter";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = scan.nextLine();

		if (month.equals("Desember") || month.equals("January") || month.equals("Fabruary"))
			season = "Winter";

		if (month.equals("March") || month.equals("April") || month.equals("May"))
			season = "Spring";

		if (month.equals("June") || month.equals("July") || month.equals("August"))
			season = "Summer";

		if (month.equals("September") || month.equals("October") || month.equals("November"))
			season = "Fall";

		System.out.println("You were born in " + season);

	}

}
