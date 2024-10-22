package com.prowings.collection.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethodDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,10,30,50,10);
		
		System.out.println(findOccuranceOf(numbers, 90));
		
		
	}

	public static int findOccuranceOf(List<Integer> numbers, int num)
	{
		return Collections.frequency(numbers, num);
	}
	
}
