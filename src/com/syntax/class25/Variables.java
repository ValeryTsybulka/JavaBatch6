package com.syntax.class25;

public class Variables {
byte b;
short b1;
int b2;	
long b3;
float b4;
double b5;
char b6='A';
boolean b7;
String b8;
	
void vv() {
	System.out.println(b+" -b "+b1+" -b1 "+b2+" -b2 "+b3+" -b3 "+b4+" -b4 "+b5+" -b5 "+b6+" -b6 "+b7+" -b7 "+b8);
	System.out.println("char="+b6);
}
public static void main(String[] args) {
	Variables nn=new Variables();
	nn.vv();
}
}
