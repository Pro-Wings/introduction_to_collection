package com.prowings.array;

public class TestArray {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		System.out.println("------------------");
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		System.out.println("Hashcode : "+nums.hashCode());
		System.out.println(nums.getClass().getName());

	}

}
