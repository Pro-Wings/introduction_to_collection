package com.prowings.array;

import java.util.Arrays;

public class SortArray2 {
	
	public static void main(String[] args) {
		
		int[] originalArray = {20,10,50,30,40,60};
		
		System.out.println("Original Array : "+ Arrays.toString(originalArray));
		
		Arrays.sort(originalArray);
		
		System.out.println("Original Array after sort : "+ Arrays.toString(originalArray));
	}
}
