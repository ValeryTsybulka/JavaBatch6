package com.syntax.class09;

public class Test2 {
	public static void main(String[] args) {
		// String[] a=new String[4];
		// a[0]=" ";
		// a[1]="*";
		// String[] a= {" ", " ", " ", "**"};                    xxxxx        xxxxx
  //                                                          xxxxxxxxxx    xxxxxxxxxx  
		// using nested loop to print clock                   xxxxxxxxxxx  xxxxxxxxxxxxx   
//		for (int h = 0; h < 24; h++) {                       xxxxxxxxxxxxxxxxxxxxxxxxxxxx 
//			for (int m = 0; m < 60; m++) {                   xxxxxxxxxxxxxxxxxxxxxxxxxxxx 
//				if (m < 10) {                                xxxxxxxxxxxxxxxxxxxxxxxxxxxx  
//					System.out.println(h + ":0" + m);        xxxxxxxxxxxxxxxxxxxxxxxxxxxx
//				} else {                                      xxxxxxxxxxxxxxxxxxxxxxxxxx
//					System.out.println(h + ":" + m);           xxxxxxxxxxxxxxxxxxxxxxxx
//				}                                               xxxxxxxxxxxxxxxxxxxxxx
//			}                                                    xxxxxxxxxxxxxxxxxxxx
//		}                                                         xxxxxxxxxxxxxxxxxx 
//		                                                            xxxxxxxxxxxxxx
//		  for (int i = 0; i < 10; i++) {                             xxxxxxxxxxxx  
//	            for (int j = 0; j < 10; j++) {                        xxxxxxxxxx
//	                for (int k = 0; k < 10; k++) {                     xxxxxxxx
//	                    for (int z = 0; z < 10; z++) {                  xxxxxx
//	      System.out.println(i + " " + j + " " + k + " " + z);           xxxx
//	                    }                                                 xx
//	                }                                                     
//		int a = 11;
//		for (int i = 1; i <= 10; i++) {
//			a -= 1;
//			for (int j = 1; j <= a; j++) {
//				System.out.print(" ");
//			}
//			for (int c = 1; c <= (i * 2) - 1; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
			String[] b= {"   ","  "," ","*****","****","***","*"};
			System.out.println(b[0]+b[0]+b[4]+b[0]+b[4]);
			System.out.println(b[0]+b[2]+b[3]+b[3]+b[3]);
			System.out.println(b[0]+b[2]+b[3]+b[3]+b[3]);
			System.out.println(b[0]+b[1]+b[3]+b[4]+b[4]);
			System.out.println(b[0]+b[0]+b[3]+b[3]+b[6]);
			System.out.println(b[0]+b[0]+b[2]+b[4]+b[3]);
			System.out.println(b[0]+b[0]+b[0]+b[3]+b[2]);
			System.out.println(b[0]+b[0]+b[0]+b[1]+b[6]);
		}
	}

