package com.syntax.class27;

public class Main {
	public static void main(String[] args) {
		Account nn=new Account();
		nn.setAcc(7560504000L);
		nn.setName(" Sumair");
        nn.setEmail(" sumair@syntax.com ");
		nn.setAmount(50000);
		
		System.out.println(nn.getAcc()+nn.getName()+nn.getEmail()+nn.getAmount());
	}

}
