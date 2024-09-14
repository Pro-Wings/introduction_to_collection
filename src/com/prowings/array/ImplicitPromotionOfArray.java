package com.prowings.array;

public class ImplicitPromotionOfArray {
	
	public static void main(String[] args) {
		
		int x = 100;
		long y = x;
		Integer z = x;
		System.out.println(y);
		
		
		
		int[] num1 = {10,20,30};
		
//		long[] num2 = num1; //implicit promotion is not possible in Array
		
		//why? - All types of arrays (including primitives) are considered as Object and hence implicit promotion is not possible for objects.
		
//		Integer[] nums3 = num1; //Autoboxing/Autounboxing is also not supported in arrays.
		
		//why? - All types of arrays (including primitives) are considered as Object and hence Autoboxing/Autounboxing is not possible for objects.

	}

}
