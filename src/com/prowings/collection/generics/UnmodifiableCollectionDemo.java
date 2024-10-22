package com.prowings.collection.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbrs = Arrays.asList(10,20,30,40,50);
		List<Integer> unmodifiedNumbers = Collections.unmodifiableList(numbrs);
		System.out.println("Original Unmodifiable List : "+unmodifiedNumbers);
		unmodifiedNumbers.get(0); 
		System.out.println("List after modification : "+unmodifiedNumbers);
		
		
	}

}
