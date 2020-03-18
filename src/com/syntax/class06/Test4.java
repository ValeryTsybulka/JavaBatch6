package com.syntax.class06;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter your mark");
	    int mark=scan.nextInt();
	    char grade='0';
	    
	    if(mark>=1 && mark<=100) {
	    if(mark>=1 && mark<25){grade='F';}
	     if(mark>=25 && mark<45){grade='E';}
	     if(mark>=45 && mark<50){grade='D';}
	     if(mark>=50 && mark<60){grade='C';}
	    if(mark>=60 && mark<80){grade='B';}
	    if(mark>80 && mark<=100){grade='A';}
	    System.out.println("Your grade is "+grade);
	    }else {System.out.println("Please enter valid mark");}
	    
	  }

}
