package com.syntax.class19;

public class AccessL {
	String a,b,c;
	int a1,b1,c1;
public AccessL (String A){
a=A;
	System.out.println(a);
}
private AccessL (String A, int A1){
a1=A1;
a=A;
	System.out.println(a+a1);}
 AccessL (String A, int A1, int A2){
a=A;
b1=A1+A2;
	System.out.println(a+b1);}
protected AccessL (String A,String B){
a=A;
b=B;
	System.out.println(a+b);}

public static void main(String[] args) {
	AccessL obj=new AccessL("Vova");
	AccessL obj1=new AccessL("Dima",5);
	AccessL obj2=new AccessL("Valer",4,5);
	AccessL obj3=new AccessL("Vova","Valer");
}

}
