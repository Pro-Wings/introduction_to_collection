package com.prowings.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyList {
	
	public static void main(String[] args) {
		
		List<Integer> nums1 = Arrays.asList(10,20,30,40,50);

		List<Integer> nums2 = Arrays.asList(100,200);
		
		System.out.println(nums1);
		System.out.println(nums2);
		
//		nums1.addAll(nums2);
		
		Collections.copy(nums1, nums2);
		
		System.out.println(nums1);
		
		System.out.println(Collections.min(nums1));
		System.out.println(Collections.max(nums1));
		
	}

}
