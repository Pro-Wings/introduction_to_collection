package com.prowings.array;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		System.out.println("main started!");
		int[] numbers = {10,20,10,20};
		
		printUniqueElements(numbers);
		
		System.out.println("Input array : "+Arrays.toString(numbers));

		int[] uniqElements = removeDuplicateElements(numbers);
		
		System.out.println("After removing duplicates : "+Arrays.toString(uniqElements));
		
		System.out.println("main ended!");
		
	}

	private static void printUniqueElements(int[] numbers) {
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i] != numbers[j])
					System.out.println(numbers[j]);
			}
		}
			
	}
	

	public static int[] removeDuplicateElements(int[] numbers) {
		
		int[] result = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i] != numbers[j])
				{
					result[i] = numbers[j];
				}
			}
		}
		return result;
	}	

}
