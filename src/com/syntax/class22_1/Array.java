package com.syntax.class22_1;

public class Array {
int sum(int[][] a){
	int sum=0;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++)
			sum+=a[i][j];
	}
	return sum;
}

public static void main(String[] args) {
	int[][] a= {{1,2,3},{4,5,6},{7,8,9},{8,7,6},{5,4,3,2,1}};
	Array nn=new Array();
	System.out.println(nn.sum(a));
}

}
