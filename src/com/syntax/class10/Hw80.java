package com.syntax.class10;

public class Hw80 {
public static void main(String[] args) {
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
		int max=a[0][0];
for(int i=0; i<a.length; i++){
  for(int j=0; j<a[i].length; j++){
    if(max<a[i][j]){ max=a[i][j];}
  }
}

System.out.println(max);

int[][] a1 = {
		{-5,-2,-3,7},
		{1,-5,-2, 2},
		{1,-2, 3,-4}
	};
int sum=0;
for(int i=0; i<a1.length; i++){
  for(int j=0; j<a1[i].length; j++){
    sum+=a1[i][j];
  }
}
System.out.println(sum);




	
}
}
