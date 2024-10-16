package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToSet {
	
	public static void main(String[] args) {
		
		Integer[] nums = {50,20,30,10,20,40,10};
		
		List duplicateNumbers = Arrays.asList(nums);
		
		Set uniqueNumbers = new TreeSet<>(duplicateNumbers);
		
		System.out.println(uniqueNumbers);
	}

}
