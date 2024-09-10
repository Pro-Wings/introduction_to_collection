package com.prowings.array;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		
		int[] data1 = {10,20,30};
		int[] data2 = {10,40,30};
		
		boolean result = arrayEquals(data1, data2);
		
		System.out.println(result);
		
	}

	private static boolean arrayEquals(int[] data1, int[] data2) {
		
		return Arrays.equals(data1, data2);
		
	}
}
