package com.prowings.array;

import java.util.Arrays;

public class ImplicitPromotionOfArray2 {
	
	public static void main(String[] args) {
		
		int[] nums1 = {10,20,30};
		
		long[] nums2 = new long[nums1.length];
		
		for(int i=0; i<nums1.length; i++)
		{
			nums2[i] = nums1[i]; //implicit promotion
		}
		
		System.out.println("After converting : "+Arrays.toString(nums2));

		Integer[] nums3 = new Integer[nums1.length];
		
		for(int i=0; i<nums1.length; i++)
		{
			nums3[i] = nums1[i]; //autoboxing
		}

		System.out.println("After converting : "+Arrays.toString(nums3));
	}

}
