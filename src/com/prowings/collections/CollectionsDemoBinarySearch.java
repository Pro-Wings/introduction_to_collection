package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoBinarySearch {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(20);
		myList.add(10);
		myList.add(50);
		myList.add(40);
		myList.add(30);
		Collections.sort(myList);
		System.out.println(myList);
		int index = searchIndexOfGivenElement(myList, 50);
		System.out.println("Element found at index : "+index);
		
	}

	
	public static int searchIndexOfGivenElement(List<Integer> list, Integer key)
	{
		return Collections.binarySearch(list, key);
	}
}
