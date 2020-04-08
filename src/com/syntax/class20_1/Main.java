package com.syntax.class20_1;

public class Main extends Method {
	
	static int[][] a={
			    {1,2,3},
			    {4,5,6},
			    {7,8,9}
			  };
	public static void main(String[] args){
		  Employee obj=new Employee();
		  obj.age=35;
		  obj.lastName="Smith";
		  obj.name="Joe";
		  obj.salary=35000;
		  obj.printE();
		  
		  Student obj1=new Student();
		  obj1.age=15;
		  obj1.grade=10;
		  obj1.lastName="Smith";
		  obj1.name="Adam";
		  obj1.printS();
		  
		  Retiree obj2=new Retiree();
		  obj2.age=15;
		  obj2.lastName="Smith";
		  obj2.name="Frank";
		  obj2.seniorActivity="tour";
		  obj2.printR();
		  
		  B nn=new B();
		  nn.showA();
		  nn.showB();
		  
		  sum(a);
		
		}
}
