package com.prowings.array;

import java.util.Arrays;
import java.util.List;

public class ArraysMethodsDemo2 {
	
	public static void main(String[] args) {
		
		int[] array1 = {10,20,30};
		int[] array2 = {40,50};
		int[] array3 = {60};
		
		Object[] arrayOfArray = {array1, array2, array3};
		
		System.out.println(Arrays.deepToString(arrayOfArray));
		
		System.out.println(array1.hashCode());
		System.out.println(Arrays.hashCode(array1));
		
		List numbers = Arrays.asList(array2);
		
		System.out.println(numbers);
	}

}
