package com.syntax.class33;

public class quiz {
	public static void main(String[] args) {
		
		String[] strs = new String[2];
		int idx=0;
		//strs[0] = "one"; strs[1]="two";
		for(String s:strs) {
			strs[idx].concat("element"+idx);
			idx++;
		}
		for(idx=0; idx<strs.length; idx++) {
			System.out.println(strs[idx]);
		}
		
	}

}
