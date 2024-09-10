package com.prowings.array;

import java.util.Arrays;

public class ArraysMethodsDemo {
	
	public static void main(String[] args) {
		
		int[] data = new int[5];
		
		Arrays.fill(data, 5);
		
		System.out.println(Arrays.toString(data));
		
		int[] data2 = {10,20,30,40,50,60,70,80,90};
		
//		int[] data3 = Arrays.copyOf(data2, data2.length);
		int[] data3 = Arrays.copyOfRange(data2, 1, 5); //from-inclusive and to- exclusive
		
		System.out.println(Arrays.toString(data3));
		
	}

}
