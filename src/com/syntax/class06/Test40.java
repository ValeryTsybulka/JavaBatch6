package com.syntax.class06;

import java.util.Scanner;

public class Test40 {
	public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter name of the instructor");
		  String name=scan.nextLine();
		  String result;
		  
		  switch(name) {
		  
		  case "Shiva":
		    result="Will take care of Java Assignment";
		    break;
		     case "Sandish":
		    result="Will take care of SDLC Assignment";
		    break;
		     case "Wegas":
		    result="Will take care of Selenium Assignment";
		    break;
		     case "Asel":
		    result="Will take care of every Assignment";
		    break;
		    default:
		    result="Invalid instractor selected";
		  }
		    System.out.println(result);
		    
		    
		    
		    
		  
		  
		}
		}
	


