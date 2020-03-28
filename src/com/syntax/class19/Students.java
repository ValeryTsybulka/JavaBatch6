package com.syntax.class19;

public class Students {
static String name;
static int grade;
int average(String n, int a,int b, int c ) {
	grade=(a+b+c)/3;
	name=n;
	return grade;
}
public static void main(String[] args) {
	Students obj1=new Students();
	obj1.average("Vova",90, 80,79);
	obj1.average("Kolja",30, 50,69);
	obj1.average("Dima",80, 77,79);
	obj1.average("Gora",88, 60,79);
	obj1.average("Ira",80, 80,79);
	System.out.println("Student "+name+" has average mark "+grade);
}

}
