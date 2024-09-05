package com.prowings.array;

public class IteratingArray {
	
	public static void main(String[] args) {
		
//		int[] nums = {10,30,50,60,70,50};

		Integer[] nums = new Integer[5];
		
		int counter = 10;
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = counter;
			counter += 10;
		}
		
		iterateUsingNormalForLoop(nums);
		iterateUsingEnhancedForLoop(nums);
		iterateUsingWhileLoop(nums);
		iterateUsingDoWhileLoop(nums);
		
	}

	public static void iterateUsingNormalForLoop(Integer[] nums) {
		System.out.println("iterating using normal for loop !!");
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("normal for loop ended!!");
		
	}

	public static void iterateUsingWhileLoop(Integer[] nums) {
		System.out.println("iterating using while loop !!");
		
		int i = 0;
		while(i<nums.length)
		{
			System.out.println(nums[i]);
			i++;
		}
		System.out.println("while loop ended!!");
		
	}

	public static void iterateUsingDoWhileLoop(Integer[] nums) {
		System.out.println("iterating using do-while loop !!");
		
		int i = 0;
		
		do
		{
			System.out.println(nums[i]);
			i++;
		}while(i<nums.length);
			
		System.out.println("do-while loop ended!!");
		
	}

	public static void iterateUsingEnhancedForLoop(Integer[] nums) {
		System.out.println("iterating using enhanced for loop !!");
		
		for(Integer i : nums)
		{
			System.out.println(i);
		}
		
		System.out.println("enhanced for loop ended!!");
		
	}

}
