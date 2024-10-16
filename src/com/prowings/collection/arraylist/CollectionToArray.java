package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		System.out.println("List : "+nums);
		
		Object[] numsArray = nums.toArray();
		
		System.out.println("Array : "+Arrays.toString(numsArray));
		
		Integer[] numsArr = nums.toArray(new Integer[0]);
		
		System.out.println("Array of Integers : "+Arrays.toString(numsArr));
		
		
	}

}
