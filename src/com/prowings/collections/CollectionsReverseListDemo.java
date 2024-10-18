package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,20,30,40,50);
		
		System.out.println(nums);
		
		Collections.reverse(nums);
		
		System.out.println("After reverse : "+nums);
		
		Collections.shuffle(nums);
		
		System.out.println("After shuffle : "+nums);

		List<Integer> nums2 = Arrays.asList(10,20,30);
		System.out.println("Before swapping : "+nums2);
		Collections.swap(nums2, 0, 2);
		System.out.println("After swapping : "+nums2);
		
		List<Integer> nums3 = new ArrayList<>();
		nums3.add(111);
		nums3.add(111);
		nums3.add(111);
		Collections.fill(nums3, 300);
		
		System.out.println(nums3);
		
		
	}
	
	

}
