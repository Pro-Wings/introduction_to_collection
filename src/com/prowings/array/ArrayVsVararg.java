package com.prowings.array;

public class ArrayVsVararg {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30};
		int x =10;
		byte y = 30;
		byte[] numbers2 = {10,20,30};
		
		int sum = sumOfAllElelements(numbers);
		
		System.out.println("Sum of all elements from specified array is : "+sum);
	}

	public static int sumOfAllElelements(int[] numbers) {
		int res = 0;
		
		for(int i=0; i<numbers.length; i++)
			res += numbers[i];
		
		return res;
	}

//	public static int sumOfAllElelements(int... numbers) {
//		int res = 0;
//		
//		for(int i=0; i<numbers.length; i++)
//			res += numbers[i];
//		
//		return res;
//	}

}
