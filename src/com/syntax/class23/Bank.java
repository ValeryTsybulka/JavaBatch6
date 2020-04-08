package com.syntax.class23;

public class Bank {
double fee, money;
public Bank(double money) {
	this.money=money;
}
double chargeFee() {
	if(money<1000) {
		fee=money*0.1;
	}else {
		fee=0;
	}return fee;
}}
class PNC extends Bank{
	public PNC(double money) {
		super(money);
	}}

class BoA extends Bank{
	BoA(double money){
		super(money);
	}
	double chargeFee() {
		if(money<1000) {
			fee=money*0.2;
		}else {
			fee=0;
		}
		return fee;
	}
}


