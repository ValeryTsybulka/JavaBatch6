package com.syntax.class10;

public class Hw79 {
	public static void main(String[] args) {
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		for(int i=0; i<a.length; i++) {
			for(int y=0; y<a[i].length; y++) {
				a[i][y]*=2;
				System.out.print(a[i][y]+" ");
			}
			System.out.println();
		}
		
		
  }
}
