package com.prowings.array;

import java.util.Arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int[] originalArray = {20,10,50,30,40,60};

		Arrays.sort(originalArray);
		
		System.out.println("After sorting : "+Arrays.toString(originalArray));
		
		int index = Arrays.binarySearch(originalArray, 50);
		
		System.out.println("Key found in index : "+index);
		
	}	
}
