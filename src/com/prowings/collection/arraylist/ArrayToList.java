package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		
		int[] nums = {a1,a2,a3};
		
//		List numbersList = Arrays.asList(nums); //we can use this if array is of Object type
		List numbersList = new ArrayList<>(); // in case if array is of primitive type, then use this
		
		for(int n : nums)
			numbersList.add(n);
	
		System.out.println("ArrayList : "+numbersList);
		System.out.println("Array : "+Arrays.toString(nums));
	}

}
