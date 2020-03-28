package com.syntax.class17;

public class Repl114 {
	
//	 String spaceOut(String s){
//		  String space=" ";
//		  String newWord="";
//		  char[] array=s.toCharArray();
//		  for(int i=0; i<s.length(); i++){
//		   String a=array[i]+space;
//		    newWord+=a;
//		  }
//		  return newWord;
//		}
//		public static void main(String[] args){
//		  Repl114 obj=new Repl114();
//		  System.out.print(obj.spaceOut("hello"));
//		  System.out.println();
//		  System.out.print(obj.spaceOut("technology"));
//		}
		public static String censorLetter(String a, char b){
			
			    a=a.replace(b, '*');
			    return a;
			  }
			  
			  public static void main(String[] args){
			    Repl114 obj=new Repl114();
			    System.out.println(obj.censorLetter("computer science",'e'));
			    System.out.println(obj.censorLetter("trick or treat", 't'));
			  }	
		
}
