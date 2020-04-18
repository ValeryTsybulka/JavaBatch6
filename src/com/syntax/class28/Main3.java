package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("In:");
			int a=scan.nextInt();
			num.add(a);
		}
		Iterator<Integer> n=num.iterator();
		while(n.hasNext()) {
			System.out.print(n.next()+" ");
		}
		
//		for(Integer b:num) {
//		System.out.print(b+" ");}
	}
}
