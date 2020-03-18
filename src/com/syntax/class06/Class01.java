package com.syntax.class06;

import java.util.Scanner;

public class Class01 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an hour");
		int hour=scan.nextInt();
		String timeOfDay;
		if(hour>=1 && hour<= 11) {
			timeOfDay="Morning";
		}else {
			if(hour>=12 && hour<= 15)
				timeOfDay="Afternoon";
	//	}else {
				if(hour>=16 && hour<= 20)
					timeOfDay="Evening";
	//	}else		
					if(hour>=21 && hour<= 24)
	//					timeOfDay="Night"
	//}else

	{

		timeOfDay = "Unknown";
	}

}

	}}
