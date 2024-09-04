package com.prowings.array;

public class ArrayOperations {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		int[] nums = {10,3,5,12,13,11,9,7};
		
		printEvenNumbers(nums);
		printOddNumbers(nums);
		
		System.out.println("main ended!!");
		
	}

	public static void printEvenNumbers(int[] nums) {
		System.out.println("Even numbers from nums array : ");
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]%2==0 )
				System.out.println(nums[i]);
		}
		
	}

	public static void printOddNumbers(int[] nums) {
		System.out.println("Odd numbers from nums array : ");
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]%2!=0 )
				System.out.println(nums[i]);
		}
		
	}

}
