package com.prowings.array;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] data = {20,10,50,30,40,60};
		
		//OutPut = 10,20,30,40,50
		
		System.out.println("Before sorting : "+Arrays.toString(data));
		sortGivenArray(data);
		System.out.println("After sorting : "+Arrays.toString(data));
	}

	
	private static void sortGivenArray(int[] arr) {

		//bubble sort
//		int n = arr.length;
//	    for (int i = 0; i < n - 1; i++) {
//	        for (int j = 0; j < n - i - 1; j++) {
//	            if (arr[j] > arr[j + 1]) {
//	                // Swap arr[j] and arr[j + 1]
//	                int temp = arr[j];
//	                arr[j] = arr[j + 1];
//	                arr[j + 1] = temp;
//	            }
//	        }
//	    }
		
		Arrays.sort(arr);
	}

}
