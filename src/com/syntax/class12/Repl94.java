package com.syntax.class12;

import java.util.Scanner;

public class Repl94 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    String text;
	    switch(browser.toLowerCase()){
	      
	      case "chrome" :
	        text="Proceed with Chrome browser";
	        break;
	        case "firefox" :
	          text="Proceed with Firefox browser";
	          break;
	          case "ie" :
	            text="Proceed with IE browser";
	            break;
	            default:
	            text="Invalid browser";
	     
	    }
	    System.out.println(text);
	  }
}
