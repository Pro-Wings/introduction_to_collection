package com.prowings.array;

import java.util.Arrays;

public class RemoveDuplicates2 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!");
		int[] numbers = {10,20,10,20,30,10,30,40,50};
		
		System.out.println("Input array : "+Arrays.toString(numbers));

		int[] uniqElements = removeDuplicateElements(numbers);
		
		System.out.println("After removing duplicates : "+Arrays.toString(uniqElements));
		
		System.out.println("main ended!");
		
	}


	public static int[] removeDuplicateElements(int[] numbers) {
		
		// Sort the array
        Arrays.sort(numbers); 
        
        // Initialize the j pointer
        int j = 0;

        // Start iterating the array from the 1st index
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[j]) {
                j++;
                // Move unique element to the next position
                numbers[j] = numbers[i]; 
            }
        }
        // Return copy of array upto index j without duplicates
        return Arrays.copyOf(numbers, j + 1); 
	}	

}
