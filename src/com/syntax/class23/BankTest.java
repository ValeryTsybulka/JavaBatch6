package com.syntax.class23;

public class BankTest {
public static void main(String[] args) {
	Bank nn=new Bank(700);
	double fee=nn.chargeFee();
	System.out.println(fee);
	
	PNC nn1=new PNC(700);
	double fee1=nn1.chargeFee();
	System.out.println(fee1);
	
	BoA nn2=new BoA(700);
	double fee2=nn2.chargeFee();
	System.out.println(fee2);
}
}
