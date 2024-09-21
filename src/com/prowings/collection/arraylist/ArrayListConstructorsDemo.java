package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class ArrayListConstructorsDemo {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		
		vector.add(123);
		vector.add(456);
		vector.add(789);
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(null);
		hs.add(10);
		hs.add(30);
		hs.add(null);
		
		System.out.println("Hashset contents : "+hs);
		
		ArrayList list2 = new ArrayList(hs);
		
		System.out.println(list2);
		
		Integer[] nums = {10,20,30,40,30,20};
		
		List<Integer> ls = Arrays.asList(nums);
		
		HashSet<Integer> uniqElements = new HashSet<>(Arrays.asList(nums));
		
		System.out.println("After removing duplicates from nums[] :"+uniqElements);
		
	}

}
