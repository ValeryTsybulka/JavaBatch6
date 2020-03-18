package com.syntax.class10;

public class Hw2 {
public static void main(String[] args) {
	int sum=0;
	int[] a1= {1,2,3,4,5,6,7,8,9};
	for(int b:a1) {
		sum+=b;}
		System.out.println(sum);
	System.out.println("^^^^^^^^^^^^^Second way^^^^^^^^^^^^^^^^");
	
	sum=0;
	for(int i=0; i<a1.length; i++) {
		sum+=a1[i];
	}
	System.out.println(sum);
}
}
