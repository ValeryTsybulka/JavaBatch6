package com.syntax.class16;

public class myFib {
public static void main(String[] args) {
	int[] fib= new int[20];
	fib[0]=0;
	fib[1]=1;
	for(int i=2; i<20; i++) {
		fib[i]=fib[i-1]+fib[i-2];
	//	System.out.print(fib[i]+" ");
	}
	//System.out.println();
	for(int a:fib) {
		System.out.print(a+" ");
	}
}
}
