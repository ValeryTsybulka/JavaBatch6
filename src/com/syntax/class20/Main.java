package com.syntax.class20;

public class Main {
public static void main(String[] args) {
	GrandDad.family="Tsybulka";
	Daughter.family="Tsybulka";
	Dad.family="Tsybulka";
	GrandDad nn2=new GrandDad();
	nn2.age=70;
	nn2.ceremonies="tour";
	nn2.name="Victor";
	nn2.tour();
	Dad nn1=new Dad();
	nn1.ceremonies="work";
	nn1.age=50;
	nn1.name="Valery";
	nn1.work();
	Daughter nn=new Daughter();
	nn.family="New family";
	nn.name="July";
	nn.age=15;
	nn.ceremonies="dance";
	
	nn.dance();
	
	
}
}
