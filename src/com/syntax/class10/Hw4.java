package com.syntax.class10;

public class Hw4 {
	public static void main(String[] args) {

		int[] nums = { 200, 30, -1, 900, 56, 787 };
    	int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max <= nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
		for(int a:nums) {
			if(max<a) {
				max=a;
			}
		}
		
		System.out.println(max);
		
	}
	}
